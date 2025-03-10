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
    public Long getIdUniversite() {
        return idUniveriste;
    }

    public void setIdUniversite(Long idUniversite) {
        this.idUniveriste = idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }
}

