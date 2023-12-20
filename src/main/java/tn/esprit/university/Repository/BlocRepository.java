package tn.esprit.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.university.models.Bloc;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
