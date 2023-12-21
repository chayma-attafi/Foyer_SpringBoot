package tn.esprit.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.university.models.Chambre;
import tn.esprit.university.models.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {

    //Récupérer la liste des chambres d'un bloc.
    List<Chambre> findByBlocIdBlock(Long idBloc);

    //Récupérer la liste des des chambres de type "DOUBLE qui ont une réservation valide.
    List<Chambre> findByTypeChambreAndReservationListEstValideIsTrue(TypeChambre typeChambre);

    //Récupérer la liste des chambres d'un foyer avec une capacité > 30
    //GreaterThan mean superieur de la valeur donner
    //GreaterThanEqual superieur ou egale
    //LessThan inferieur
    //LessThanEqual inferieur ou egale
    //findByQuantityBetween(int minValue, int maxValue); entre deux valeur donner
    List<Chambre> findByBlocFoyerCapitaleFoyerGreaterThan(Long capitaleFoyer);


    //3
    List<Chambre> findByNumChambreIn(List<Long> numeroChambreList);


}
