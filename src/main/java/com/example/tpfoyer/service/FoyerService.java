package com.example.tpfoyer.service;

import com.example.tpfoyer.entites.Foyer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService{
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
}
