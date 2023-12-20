package tn.esprit.university.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idEtudiant")
    long idEtudiant;

    String nomE,prenomE,ecoleE;
    long CIN;
    Date datedeNaissance;

    @JsonIgnore
    @ToString.Exclude
    @ManyToMany(mappedBy = "etudiantList")
    List<Reservation> reservationList =new ArrayList<>();

}
