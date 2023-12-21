package tn.esprit.university.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.university.Repository.BlocRepository;
import tn.esprit.university.Repository.ChambreRepository;
import tn.esprit.university.ServiceInterface.ChambreService;
import tn.esprit.university.models.Bloc;
import tn.esprit.university.models.Chambre;
import tn.esprit.university.models.TypeChambre;

import java.util.List;

@AllArgsConstructor
@Service
public class ChambreImpl implements ChambreService {
    ChambreRepository chambreRepository;
    BlocRepository blocRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public List<Chambre> RecupereListChambreDunBolc(Long idBloc) {
        return chambreRepository.findByBlocIdBlock(idBloc);
    }

    @Override
    public List<Chambre> RecupereListChambreTypeDOUBLEandReservationValide(TypeChambre typeChambre) {
        return chambreRepository.findByTypeChambreAndReservationListEstValideIsTrue(typeChambre);
    }

    @Override
    public List<Chambre> RecupererListChambreDunFoyerAvecUneCapacite(Long capaciteFoyer) {
        return chambreRepository.findByBlocFoyerCapitaleFoyerGreaterThan(capaciteFoyer);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {

        Bloc b = blocRepository.findById(idBloc).orElse(null);

        //recuprer liste des chambre par num chambre
        List<Chambre> chambreList = chambreRepository.findByNumChambreIn(numChambre);

        //parcurer la liste de chambre et affecter a la fois a un bloc
        for(Chambre c: chambreList) {
            c.setBloc(b);
            chambreRepository.save(c);
        }

        return b;
    }


}
