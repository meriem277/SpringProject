package com.example.tpfoyer.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idchambre ;
    private  long numerochambre ;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    // relation bidirectionnelle bloc chambre (1-*)
    @ManyToOne
    private Bloc bloc ;

    //relation unidirectionnelle chambre reservation (1-*)
    @OneToMany
    private List<Reservation> reservations;



}

