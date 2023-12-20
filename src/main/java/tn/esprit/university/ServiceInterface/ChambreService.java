package tn.esprit.university.ServiceInterface;

import tn.esprit.university.models.Chambre;

import java.util.List;

public interface ChambreService {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c);

    Chambre updateChambre (Chambre c);

    Chambre retrieveChambre (long idChambre);
    List<Chambre> RecupereListChambreDunBolc(Long idBloc);
}
