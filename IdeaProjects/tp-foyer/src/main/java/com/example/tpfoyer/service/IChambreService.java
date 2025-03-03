package com.example.tpfoyer.service;

import com.example.tpfoyer.entites.Chambre;

import java.util.List;

public interface IChambreService {

    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre c);
    Chambre retrieveChambre (long idChambre);
}
