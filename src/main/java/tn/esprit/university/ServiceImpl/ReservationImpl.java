package tn.esprit.university.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.university.Repository.ReservationRepository;
import tn.esprit.university.ServiceInterface.ReservationService;
import tn.esprit.university.models.Reservation;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservationImpl implements ReservationService {
    ReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }
}
