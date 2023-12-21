package tn.esprit.university.ServiceInterface;

import tn.esprit.university.models.Foyer;
import tn.esprit.university.models.University;

import java.util.List;

public interface UniversityService {
    List<University> retrieveAllUniversities();

    University addUniversite (University u);

    University updateUniversite (University u);

    University retrieveUniversite (long idUniversite);

    //Partie 5 : Services avancés
    //1
    public University affecterFoyerAUniversite (long idFoyer, String nomUniversite) ;

    //2
    public University desaffecterFoyerAUniversite (long idUniversite) ;

    //4
    public Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, long idUniversite) ;
}
