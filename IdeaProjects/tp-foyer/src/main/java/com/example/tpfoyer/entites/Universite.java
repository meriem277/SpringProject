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
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniveriste ;
    private String nomUniversite ;
    private  String adresse ;
    // relation bidirectionnelle foyer universite (1-1)
    @OneToOne
    private Foyer foyer ;
    @OneToMany (cascade = CascadeType.ALL)
    private List<Bloc> blocs ;
}
