package tn.esprit.university.ServiceInterface;

import tn.esprit.university.models.Etudiant;

import java.util.List;

public interface EtudintService {
    List<Etudiant> retrieveAllEtudiants();

    List<Etudiant> addEtudiants (List<Etudiant> etudiants);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(long idEtudiant);

    void removeEtudiant(long idEtudiant);
}
