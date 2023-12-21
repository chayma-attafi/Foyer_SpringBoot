package tn.esprit.university.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.university.ServiceInterface.UniversityService;
import tn.esprit.university.models.Foyer;
import tn.esprit.university.models.University;

import java.util.List;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class UniversityController {
    UniversityService universityService;

    @GetMapping("/retrieveAllUniversities")
    public List<University> retrieveAllUniversities() {
        return universityService.retrieveAllUniversities();
    }

    @PutMapping("/addUniversite")
    public University addUniversite(@RequestBody University u) {
        return universityService.addUniversite(u);
    }

    @PostMapping("/updateUniversite")
    public University updateUniversite(@RequestBody University u) {
        return universityService.updateUniversite(u);
    }

    @GetMapping("/retrieveUniversite/{idUniversite}")
    public University retrieveUniversite(@PathVariable long idUniversite) {
        return universityService.retrieveUniversite(idUniversite);
    }



    @PutMapping("/affecterFoyerAUniversite/{idFoyer}/{nomUniversite}")
    public University affecterFoyerAUniversite(@PathVariable long idFoyer,
                                               @PathVariable String nomUniversite) {
        return universityService.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }

    @PutMapping("/desaffecterFoyerAUniversite/{idUniversite}")
    public University desaffecterFoyerAUniversite(@PathVariable long idUniversite) {
        return universityService.desaffecterFoyerAUniversite(idUniversite);
    }

    @PutMapping("/ajouterFoyerEtAffecterAUniversite/{idUniversite}")
    public Foyer ajouterFoyerEtAffecterAUniversite(@RequestBody Foyer foyer,
                                                   @PathVariable long idUniversite) {
        return universityService.ajouterFoyerEtAffecterAUniversite(foyer, idUniversite);
    }
}
