package tn.esprit.university.ServiceInterface;

import tn.esprit.university.models.Foyer;

import java.util.List;

public interface FoyerService {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer (Foyer f);

    Foyer updateFoyer (Foyer f);

    Foyer retrieveFoyer (long idFoyer);

    void removeFoyer (long idFoyer);
    Foyer RecupereFoyerDunUniversity(Long idUniversity);
}
