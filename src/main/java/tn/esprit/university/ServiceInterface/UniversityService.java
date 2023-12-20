package tn.esprit.university.ServiceInterface;

import tn.esprit.university.models.University;

import java.util.List;

public interface UniversityService {
    List<University> retrieveAllUniversities();

    University addUniversite (University u);

    University updateUniversite (University u);

    University retrieveUniversite (long idUniversite);
}
