package tn.esprit.university.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.university.ServiceInterface.EtudintService;
import tn.esprit.university.models.Etudiant;

import java.util.List;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class EtudiantController {
    EtudintService etudintService;

    @GetMapping("/retrieveAllEtudiants")
    public List<Etudiant> retrieveAllEtudiants() {
        return etudintService.retrieveAllEtudiants();
    }

    @PutMapping("/addEtudiants")
    public List<Etudiant> addEtudiants(@RequestBody List<Etudiant> etudiants) {
        return etudintService.addEtudiants(etudiants);
    }

    @PostMapping("/updateEtudiant")
    public Etudiant updateEtudiant( @RequestBody Etudiant e) {
        return etudintService.updateEtudiant(e);
    }

    @GetMapping("/retrieveEtudiant/{idEtudiant}")
    public Etudiant retrieveEtudiant(@PathVariable long idEtudiant) {
        return etudintService.retrieveEtudiant(idEtudiant);
    }

    @DeleteMapping("/removeEtudiant/{idEtudiant}")
    public void removeEtudiant(@PathVariable long idEtudiant) {
        etudintService.removeEtudiant(idEtudiant);
    }
}
