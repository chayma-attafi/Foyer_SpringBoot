package tn.esprit.university.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Reservation")
public class Reservation implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idReservation")
    String idReservation;

    LocalDate anneeUniversity;
    Boolean estValide;


    @JsonIgnore
    @ToString.Exclude
    @ManyToMany
    List<Etudiant> etudiantList = new ArrayList<>();
}
