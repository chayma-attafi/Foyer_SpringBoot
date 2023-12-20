package tn.esprit.university.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.university.Repository.ChambreRepository;
import tn.esprit.university.ServiceInterface.ChambreService;
import tn.esprit.university.models.Chambre;

import java.util.List;

@AllArgsConstructor
@Service
public class ChambreImpl implements ChambreService {
    ChambreRepository chambreRepository;
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
}
