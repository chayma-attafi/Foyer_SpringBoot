package tn.esprit.university.Controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.university.ServiceInterface.FoyerService;
import tn.esprit.university.models.Foyer;
import java.util.List;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("Foyer")
public class FoyerController {
    FoyerService foyerService;


    @GetMapping("/retrieveAllFoyers")
    public List<Foyer> retrieveAllFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    @PutMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return foyerService.addFoyer(f);
    }

    @PostMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        return foyerService.updateFoyer(f);
    }

    @GetMapping("/retrieveFoyer/{idFoyer}")
    public Foyer retrieveFoyer(@PathVariable long idFoyer) {
        return foyerService.retrieveFoyer(idFoyer);
    }

    @DeleteMapping("/removeFoyer/{idFoyer}")
    public void removeFoyer(@PathVariable long idFoyer) {
        foyerService.removeFoyer(idFoyer);
    }

    @GetMapping("/RecupereFoyerDunUniversity/{idUniversity}")
    public Foyer RecupereFoyerDunUniversity(@PathVariable Long idUniversity) {
        return foyerService.RecupereFoyerDunUniversity(idUniversity);
    }
}
