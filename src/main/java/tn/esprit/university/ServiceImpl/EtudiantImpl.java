package tn.esprit.university.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.university.Repository.EtudiantRepository;
import tn.esprit.university.ServiceInterface.EtudintService;
import tn.esprit.university.models.Etudiant;

import java.util.List;


@AllArgsConstructor
@Service
public class EtudiantImpl implements EtudintService {
    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {

        return etudiantRepository.saveAll(etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(long idEtudiant) {

        etudiantRepository.deleteById(idEtudiant);
    }
}
