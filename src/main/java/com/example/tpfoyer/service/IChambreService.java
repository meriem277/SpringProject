package com.example.tpfoyer.service;

import com.example.tpfoyer.entites.Chambre;
import com.example.tpfoyer.entites.TypeChambre;

import java.util.List;

public interface IChambreService {

    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre c);
    Chambre retrieveChambre (long idChambre);

    List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre typeC);

    List<Chambre> findByBlocIdBlocAndTypeChambre(Long blocIdBloc, TypeChambre typeChambre);

    List<Chambre> getChambresParBlocEtTypeJPQL(Long idBloc, TypeChambre typeChambre);

    void saveAll(List<Chambre> chambres);

    List<Chambre> findAllById(List<Long> ids);
}
