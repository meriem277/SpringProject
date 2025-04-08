package com.example.tpfoyer.service;

import com.example.tpfoyer.entites.Chambre;
import com.example.tpfoyer.entites.TypeChambre;
import com.example.tpfoyer.repository.IChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ChambreService implements IChambreService {

    public ChambreService(IChambreRepository chambreRepository) {
        this.chambreRepository = chambreRepository;
    }

    private final IChambreRepository chambreRepository;


    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre typeC) {
        return chambreRepository.getChambresNonReserveParNomUniversiteEtTypeChambre(nomUniversite, typeC);
    }

    @Override
    public List<Chambre> findByBlocIdBlocAndTypeChambre(Long blocIdBloc, TypeChambre typeC) {
        return chambreRepository.findByBlocIdBlocAndTypeC(blocIdBloc, typeC);  // Use typeC instead of typeChambre
    }

    @Override
    public List<Chambre> getChambresParBlocEtTypeJPQL(Long idBloc, TypeChambre typeC) {
        return chambreRepository.getChambresParBlocEtType(idBloc, typeC);
    }

    @Override
    public void saveAll(List<Chambre> chambres) {

    }

    @Override
    public List<Chambre> findAllById(List<Long> ids) {
        return chambreRepository.findAllById(ids);
    }

}