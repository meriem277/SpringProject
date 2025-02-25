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
public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;
    //relation bidrectionnelle foyer bloc
    @ManyToOne
    private Foyer foyer;

    // relation bidirectionnelle bloc chambre (1-*)
    @OneToMany (mappedBy = "bloc")
    private List<Chambre> chambres ;
}
