package tn.esprit.university.ServiceImpl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.university.Repository.FoyerRepository;
import tn.esprit.university.ServiceInterface.FoyerService;
import tn.esprit.university.models.Foyer;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class FoyerImpl implements FoyerService {
    FoyerRepository foyerRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public Foyer RecupereFoyerDunUniversity(Long idUniversity) {
        return foyerRepository.findByUniversityIdUniveristy(idUniversity);
    }


}
