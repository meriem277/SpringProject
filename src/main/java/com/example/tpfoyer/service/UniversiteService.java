package com.example.tpfoyer.service;

import com.example.tpfoyer.entites.Foyer;
import com.example.tpfoyer.entites.Universite;
import com.example.tpfoyer.repository.IFoyerRepository;
import com.example.tpfoyer.repository.IUniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional

public class UniversiteService implements IUniversiteService{
    @Autowired
    private IFoyerRepository foyerRepository;

    @Autowired
    private IUniversiteRepository universiteRepository;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return null;
    }

    @Override
    public Universite addUniversite(Universite u) {
        return null;
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return null;
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return null;
    }
    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Foyer foyer = foyerRepository.findById(idFoyer)
                .orElseThrow(() -> new RuntimeException("Foyer non trouvé"));

        Universite universite = universiteRepository.findByNomUniversite(nomUniversite)
                .orElseThrow(() -> new RuntimeException("Université non trouvée"));

        foyer.setUniversite(universite);
        foyerRepository.save(foyer);

        return universite;
    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite)
                .orElseThrow(() -> new RuntimeException("Université non trouvée"));

        if (universite.getFoyer() != null) {
            Foyer foyer = universite.getFoyer();
            foyer.setUniversite(null);
            foyerRepository.save(foyer);
            universite.setFoyer(null);
            universiteRepository.save(universite);
        }

        return universite;
    }
}
