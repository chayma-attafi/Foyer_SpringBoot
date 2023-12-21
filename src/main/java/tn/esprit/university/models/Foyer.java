package tn.esprit.university.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idFoyer")
    long idFoyer;

    String nomFoyer;

    long capitaleFoyer;

    @JsonIgnore
    @ToString.Exclude
    @OneToOne(mappedBy = "foyer")
    University university;

    //cascade pour ajouter foyer et affecter bloc
    //@JsonIgnore pour afficher liste des blocs
    @ToString.Exclude
    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL)
    List<Bloc> blockList=new ArrayList<>();

}
