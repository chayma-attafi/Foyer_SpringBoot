package tn.esprit.university.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
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

    @ToString.Exclude
    @OneToOne(mappedBy = "foyer")
    University university;

    @ToString.Exclude
    @OneToMany(mappedBy = "foyer")
    List<Bloc> blockList;

}
