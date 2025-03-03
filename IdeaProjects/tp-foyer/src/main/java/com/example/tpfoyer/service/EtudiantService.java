package com.example.tpfoyer.service;

import com.example.tpfoyer.entites.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService  implements IEtudiantService{
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return null;
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return null;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return null;
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return null;
    }

    @Override
    public void removeEtudiant(long idEtudiant) {

    }
}
