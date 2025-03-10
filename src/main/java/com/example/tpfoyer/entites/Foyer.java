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
    public long getIdFoyer() {
        return idFoyer;
    }

    public void setIdFoyer(long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public String getNomFoyer() {
        return nomfoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomfoyer = nomFoyer;
    }

    public long getCapaciteFoyer() {
        return capaciteFoyer;
    }

    public void setCapaciteFoyer(long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }

    public Universite getUniversite() {
        return universite;
    }

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }

    public List<Bloc> getBloc() {
        return blocs;
    }

    public void setBloc(List<Bloc> bloc) {
        this.blocs = bloc;
    }
}



