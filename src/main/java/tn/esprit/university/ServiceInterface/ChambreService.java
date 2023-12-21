package tn.esprit.university.ServiceInterface;

import tn.esprit.university.models.Bloc;
import tn.esprit.university.models.Chambre;
import tn.esprit.university.models.TypeChambre;

import java.util.List;

public interface ChambreService {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c);

    Chambre updateChambre (Chambre c);

    Chambre retrieveChambre (long idChambre);
    List<Chambre> RecupereListChambreDunBolc(Long idBloc);

    List<Chambre> RecupereListChambreTypeDOUBLEandReservationValide(TypeChambre typeChambre);
    List<Chambre> RecupererListChambreDunFoyerAvecUneCapacite(Long capaciteFoyer);
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) ;

}
