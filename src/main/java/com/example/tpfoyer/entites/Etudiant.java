package com.example.tpfoyer.entites;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idEtudiant ;
    private String nomEtu ;
    private String prenomEtu ;
    @NonNull
    private long cin ;
    private String ecole ;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance ;

    // relation bidirectionnelle etudiant reservation (*-*)
    @ManyToMany( mappedBy = "etudiants")

    private List<Reservation> reservations ;
    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNomEt() {
        return nomEtu;
    }

    public void setNomEt(String nomEt) {
        this.nomEtu = nomEt;
    }

    public String getPrenomEt() {
        return prenomEtu;
    }

    public void setPrenomEt(String prenomEt) {
        this.prenomEtu = prenomEt;
    }

    public long getCin() {
        return cin;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

}
