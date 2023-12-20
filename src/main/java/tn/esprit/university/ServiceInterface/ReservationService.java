package tn.esprit.university.ServiceInterface;

import tn.esprit.university.models.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> retrieveAllReservation();

    Reservation updateReservation (Reservation res);

    Reservation retrieveReservation (String idReservation);
}
