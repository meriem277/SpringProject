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
public class Foyer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomfoyer;
    private Long capaciteFoyer;
    // relation bidirectionnelle foyer bloc (1-*)
    @OneToMany( mappedBy = "foyer")
    private List<Bloc> blocs ;

    // relation bidirectionnelle foyer universite (1-1)
    @OneToOne (mappedBy = "foyer")
    private Universite universite ;
}



