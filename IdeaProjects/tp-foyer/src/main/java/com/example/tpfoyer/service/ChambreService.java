package com.example.tpfoyer.service;

import com.example.tpfoyer.entites.Chambre;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {
    @Override
    public List<Chambre> retrieveAllChambres() {
        return null;
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return null;
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return null;
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return null;
    }
}
