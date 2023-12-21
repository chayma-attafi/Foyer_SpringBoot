package tn.esprit.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.university.models.Bloc;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {

    //Récupérer la liste des blocs d'un foyer
    List<Bloc> findByFoyerIdFoyer(Long idFoyer);

    //Récupérer le bloc d'une chambre.
    Bloc findByChambreListIdChambre(Long idChmabre);

    //Récupérer la liste des blocs par le nom d'un foyer ainsi que l'adresse de l'université.
    List<Bloc> findByFoyerNomFoyerContainsAndFoyerUniversityAdresseContains(String NomFoyer, String AdressUniveristy);
}
