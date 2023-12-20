package tn.esprit.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.university.models.Foyer;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {
    Foyer findByUniversityIdUniveristy(Long idUniveristy);
}
