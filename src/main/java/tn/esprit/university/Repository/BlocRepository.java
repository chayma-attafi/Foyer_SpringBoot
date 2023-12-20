package tn.esprit.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.university.models.Bloc;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
    List<Bloc> findByFoyerIdFoyer(Long idFoyer);
    Bloc findByChambreListIdChambre(Long idChmabre);
}
