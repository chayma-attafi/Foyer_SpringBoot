package tn.esprit.university.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.university.Repository.BlocRepository;
import tn.esprit.university.ServiceInterface.BlocService;
import tn.esprit.university.models.Bloc;
import java.util.List;

@AllArgsConstructor
@Service
public class BlocImpl implements BlocService {
    BlocRepository blocRepository;
    @Override
    public List<Bloc> retrieveBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {
            blocRepository.deleteById(idBloc);
    }

    @Override
    public List<Bloc> RecupererlistDdesblocsPourfoyer(Long idFoyer) {
        return blocRepository.findByFoyerIdFoyer(idFoyer);
    }

    @Override
    public Bloc recupereBlockDunChmabre(Long idChambrer) {
        return blocRepository.findByChambreListIdChambre(idChambrer);
    }

    @Override
    public List<Bloc> RecupererListBlockParNomFoyerAndAdresseUniversity(String nom, String adress) {
        return blocRepository.findByFoyerNomFoyerContainsAndFoyerUniversityAdresseContains(nom,adress);
    }
}
