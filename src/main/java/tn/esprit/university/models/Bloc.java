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
@Table(name = "Bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idBlock")
    long idBlock;

    String nomBlock;
    long apitaleBlock;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    Foyer foyer;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "bloc")
    List<Chambre> chambreList = new ArrayList<>();



}
