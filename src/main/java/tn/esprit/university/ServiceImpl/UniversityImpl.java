package tn.esprit.university.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.university.Repository.UniversityRepository;
import tn.esprit.university.ServiceInterface.UniversityService;
import tn.esprit.university.models.University;

import java.util.List;

@AllArgsConstructor
@Service
public class UniversityImpl implements UniversityService {
    UniversityRepository universityRepository;
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
}
