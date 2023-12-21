package tn.esprit.university.ServiceInterface;

import tn.esprit.university.models.Bloc;

import java.util.List;

public interface BlocService {
    List<Bloc> retrieveBlocs();

    Bloc updateBloc (Bloc bloc);

    Bloc addBloc (Bloc bloc);

    Bloc retrieveBloc (long idBloc);

    void removeBloc (long idBloc);
    List<Bloc> RecupererlistDdesblocsPourfoyer(Long idFoyer);
    Bloc recupereBlockDunChmabre(Long idChambrer);

    List<Bloc> RecupererListBlockParNomFoyerAndAdresseUniversity(String nom, String adress);

}
