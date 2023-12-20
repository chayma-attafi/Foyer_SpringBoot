package tn.esprit.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.university.models.Chambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre> findByBlocIdBlock(Long idBloc);
}
