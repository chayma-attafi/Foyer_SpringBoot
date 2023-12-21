package tn.esprit.university.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.university.ServiceInterface.ChambreService;
import tn.esprit.university.models.Bloc;
import tn.esprit.university.models.Chambre;
import tn.esprit.university.models.TypeChambre;

import java.util.List;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class ChambreController {
    ChambreService chambreService;

    @GetMapping("/retrieveAllChambres")
    public List<Chambre> retrieveAllChambres() {
        return chambreService.retrieveAllChambres();
    }

    @PutMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        return chambreService.addChambre(c);
    }

    @PostMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre c) {
        return chambreService.updateChambre(c);
    }

    @GetMapping("/retrieveChambre/{idChambre}")
    public Chambre retrieveChambre(@PathVariable long idChambre) {
        return chambreService.retrieveChambre(idChambre);
    }

    @GetMapping("/RecupereListChambreDunBolc/{idBloc}")
    public List<Chambre> RecupereListChambreDunBolc(@PathVariable Long idBloc) {
        return chambreService.RecupereListChambreDunBolc(idBloc);
    }

    @GetMapping("/RecupereListChambreTypeDOUBLEandReservationValide/{typeChambre}")
    public List<Chambre> RecupereListChambreTypeDOUBLEandReservationValide(@PathVariable TypeChambre typeChambre) {
        return chambreService.RecupereListChambreTypeDOUBLEandReservationValide(typeChambre);
    }

    @GetMapping("/RecupererListChambreDunFoyerAvecUneCapacite/{capaciteFoyer}")
    public List<Chambre> RecupererListChambreDunFoyerAvecUneCapacite(@PathVariable Long capaciteFoyer) {
        return chambreService.RecupererListChambreDunFoyerAvecUneCapacite(capaciteFoyer);
    }

    //3

    @PutMapping("/affecterChambresABloc/{idBloc}")
    public Bloc affecterChambresABloc(@RequestBody List<Long> numChambre,
                                      @PathVariable long idBloc) {
        return chambreService.affecterChambresABloc(numChambre, idBloc);
    }



}
