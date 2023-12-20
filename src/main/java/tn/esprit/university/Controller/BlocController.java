package tn.esprit.university.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.university.ServiceInterface.BlocService;
import tn.esprit.university.models.Bloc;

import java.util.List;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class BlocController {
    BlocService blocService;

    @GetMapping("/retrieveBlocs")
    public List<Bloc> retrieveBlocs() {
        return blocService.retrieveBlocs();
    }

    @PostMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @PutMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @GetMapping("/retrieveBloc/{idBloc}")
    public Bloc retrieveBloc(@PathVariable long idBloc) {
        return blocService.retrieveBloc(idBloc);
    }

    @DeleteMapping("/removeBloc/{idBloc}")
    public void removeBloc(@PathVariable long idBloc) {
        blocService.removeBloc(idBloc);
    }

    @GetMapping("/RecupererlistDdesblocsPourfoyer/{idFoyer}")
    public List<Bloc> RecupererlistDdesblocsPourfoyer(@PathVariable Long idFoyer) {
        return blocService.RecupererlistDdesblocsPourfoyer(idFoyer);
    }

    @GetMapping("/recupereBlockDunChmabre/{idChambrer}")
    public Bloc recupereBlockDunChmabre(@PathVariable Long idChambrer) {
        return blocService.recupereBlockDunChmabre(idChambrer);
    }
}
