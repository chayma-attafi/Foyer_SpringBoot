package tn.esprit.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.university.models.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
