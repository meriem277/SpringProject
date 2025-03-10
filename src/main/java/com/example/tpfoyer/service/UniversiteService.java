package com.example.tpfoyer.service;

import com.example.tpfoyer.entites.Universite;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{
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
}
