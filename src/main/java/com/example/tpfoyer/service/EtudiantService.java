package com.example.tpfoyer.service;

import com.example.tpfoyer.entites.Etudiant;
import com.example.tpfoyer.repository.IEtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService  implements IEtudiantService{

    @Autowired
    IEtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) etudiantRepository.findAll();    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return (List<Etudiant>) etudiantRepository.saveAll(etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return etudiantRepository.findById((int) idEtudiant).orElse(null);    }

    @Override
    public void removeEtudiant(long idEtudiant) {
        etudiantRepository.deleteById((int) idEtudiant);

    }
    @Override
    public Etudiant addEtudiant(Etudiant et) {
        return etudiantRepository.save(et);
    }
}
