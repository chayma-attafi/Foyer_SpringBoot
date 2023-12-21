package tn.esprit.university.ServiceImpl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.university.Repository.BlocRepository;
import tn.esprit.university.Repository.FoyerRepository;
import tn.esprit.university.Repository.UniversityRepository;
import tn.esprit.university.ServiceInterface.UniversityService;
import tn.esprit.university.models.Bloc;
import tn.esprit.university.models.Foyer;
import tn.esprit.university.models.University;

import java.util.List;

@AllArgsConstructor
@Service
public class UniversityImpl implements UniversityService {
    UniversityRepository universityRepository;
    FoyerRepository foyerRepository;
    BlocRepository blocRepository;
    @Override
    public List<University> retrieveAllUniversities() {
        return universityRepository.findAll();
    }

    @Override
    public University addUniversite(University u) {
        return universityRepository.save(u);
    }

    @Override
    public University updateUniversite(University u) {
        return universityRepository.save(u);
    }

    @Override
    public University retrieveUniversite(long idUniversite) {
        return universityRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public University affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        University u = universityRepository.findByNomUnivrsityLike(nomUniversite);
        Foyer f = foyerRepository.findById(idFoyer).orElse(null);

        //affecter Foyer a University
        u.setFoyer(f);

        return universityRepository.save(u);
    }

    @Override
    public University desaffecterFoyerAUniversite(long idUniversite) {
        University u = universityRepository.findById(idUniversite).orElse(null);
        //desaffecter Foyer a University
        u.setFoyer(null);
        return universityRepository.save(u);
    }

    @Transactional
    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        University u = universityRepository.findById(idUniversite).orElse(null);
        //ajout le foyer
        foyerRepository.save(foyer);

        //affecter les blocs ou foyer
        for(Bloc bloc : foyer.getBlockList())
        {
            bloc.setFoyer(foyer);
            blocRepository.save(bloc);
        }
        //check i university not null
        assert u != null;
        u.setFoyer(foyer);
        universityRepository.save(u);

        return foyer;
    }


}
