package tn.esprit.foyer.models;

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
@Table(name = "Chambre")
public class Chambre  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idChambre")
    long idChambre;

    long numChambre;

    @Enumerated(EnumType.STRING)
    TypeChambre typeChambre;

    @ToString.Exclude
    @ManyToOne
    Bloc bloc;

    @ToString.Exclude
    @OneToMany
    List<Reservation> reservationList = new ArrayList<>();
}
