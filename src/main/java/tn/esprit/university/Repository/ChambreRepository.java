package tn.esprit.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.university.models.Chambre;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
