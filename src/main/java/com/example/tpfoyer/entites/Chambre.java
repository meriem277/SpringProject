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
    @JoinColumn(name = "id_bloc")
    private Bloc bloc ;

    //relation unidirectionnelle chambre reservation (1-*)
    @OneToMany(mappedBy = "chambre")
    private List<Reservation> reservations;

    public Long getIdChambre() {
        return idchambre;
    }

    public void setIdChambre(Long idChambre) {
        this.idchambre = idChambre;
    }

    public long getNumeroChambre() {
        return numerochambre;
    }

    public void setNumeroChambre(long numeroChambre) {
        this.numerochambre = numeroChambre;
    }

    public TypeChambre getTypeC() {
        return typeC;
    }

    public void setTypeChambre(TypeChambre TypeC ) {
        this.typeC = TypeC;
    }

    public Bloc getBloc() {
        return bloc;
    }

    public void setBloc(Bloc bloc) {
        this.bloc = bloc;
    }




}

