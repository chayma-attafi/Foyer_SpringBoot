package tn.esprit.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.university.models.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
