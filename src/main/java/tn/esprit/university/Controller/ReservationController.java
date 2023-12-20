package tn.esprit.university.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.university.ServiceInterface.ReservationService;
import tn.esprit.university.models.Reservation;

import java.util.List;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class ReservationController {
    ReservationService reservationService;

    @GetMapping("/retrieveAllReservation")
    public List<Reservation> retrieveAllReservation() {
        return reservationService.retrieveAllReservation();
    }

    @PostMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation res) {
        return reservationService.updateReservation(res);
    }

    @GetMapping("/retrieveReservation/{idReservation}")
    public Reservation retrieveReservation(@PathVariable String idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }
}
