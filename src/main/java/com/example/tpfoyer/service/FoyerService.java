package com.example.tpfoyer.service;

import com.example.tpfoyer.entites.Bloc;
import com.example.tpfoyer.entites.Foyer;
import com.example.tpfoyer.entites.Universite;
import com.example.tpfoyer.repository.IBlocRepository;
import com.example.tpfoyer.repository.IFoyerRepository;
import com.example.tpfoyer.repository.IUniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService{

    @Autowired
    private IFoyerRepository foyerRepository;

    @Autowired
    private IUniversiteRepository universiteRepository;

    @Autowired
    private IBlocRepository blocRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return null;
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return null;
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return null;
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return null;
    }

    @Override
    public void removeFoyer(long idFoyer) {

    }
    @Override
    @Transactional
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        // Récupérer l'université par son ID
        Universite universite = universiteRepository.findById(idUniversite)
                .orElseThrow(() -> new RuntimeException("Université non trouvée"));

        // Assigner l'université au foyer
        foyer.setUniversite(universite);

        // Sauvegarder le foyer
        Foyer savedFoyer = foyerRepository.save(foyer);

        // Sauvegarder les blocs associés
        if (foyer.getBlocs() != null) {
            for (Bloc bloc : foyer.getBlocs()) {
                bloc.setFoyer(savedFoyer);
                blocRepository.save(bloc);
            }
        }

        return savedFoyer;
    }
}
