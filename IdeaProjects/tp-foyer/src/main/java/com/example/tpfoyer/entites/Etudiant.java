package com.example.tpfoyer.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

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
    private long cin ;
    private String ecole ;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance ;


}
