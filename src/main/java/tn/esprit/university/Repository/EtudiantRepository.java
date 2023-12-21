package tn.esprit.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.university.models.Etudiant;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    //Récupérer la liste des étudiants de l'année universitaire actuelle
    List<Etudiant> findByReservationListAnneeUniversity(LocalDate date);

}
