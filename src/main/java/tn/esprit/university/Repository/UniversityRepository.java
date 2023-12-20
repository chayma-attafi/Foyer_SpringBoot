package tn.esprit.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.university.models.University;

@Repository
public interface UniversityRepository extends JpaRepository<University,Long> {
}
