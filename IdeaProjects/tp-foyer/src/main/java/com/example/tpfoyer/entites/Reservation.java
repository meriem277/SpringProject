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
@Table(name = "Reservation") // Assurez-vous du bon nom de table
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String idReservation;
    @Temporal(TemporalType.DATE)
    private Date  anneeUniversitaie ;
    private  boolean estValide ;
    // relation bidirectionnelle etudiant reservation (*-*)
    @ManyToMany
    private List<Etudiant> etudiants ;
}



