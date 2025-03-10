package com.example.tpfoyer.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) parceque genratevalue  is only for int
    private  String idReservation;
    @Temporal(TemporalType.DATE)
    private Date  anneeUniversitaie ;
    private  boolean estValide ;

    @ManyToOne
    private Bloc bloc;

    // relation bidirectionnelle etudiant reservation (*-*)
    @ManyToMany
    private List<Etudiant> etudiants ;

    @ManyToOne(cascade = CascadeType.ALL)  // This will cascade all operations (persist, merge, etc.)
    @JoinColumn(name = "chambre_id")
    private Chambre chambre;

    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public Date getAnneeUniversitaire() {
        return anneeUniversitaie;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaie = anneeUniversitaire;
    }

    public boolean isEstValide() {
        return estValide;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }

    public Bloc getBloc() {
        return bloc;
    }

    public void setBloc(Bloc bloc) {
        this.bloc = bloc;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }
}



