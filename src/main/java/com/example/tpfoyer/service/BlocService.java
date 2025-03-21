package com.example.tpfoyer.service;


import com.example.tpfoyer.entites.Bloc;
import com.example.tpfoyer.entites.Chambre;
import com.example.tpfoyer.repository.IBlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocService implements IBlocService{
    IBlocRepository blocRepository;
    IChambreService chambreRepository;

    @Override
    public List<Bloc> retrieveBlocs() {
        return (List<Bloc>) blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {
        blocRepository.deleteById(idBloc);
    }


    @Override
    public Bloc affecterChambresABloc(List<Long> numChambres, long idBloc) {
        Bloc bloc = blocRepository.findById(idBloc)
                .orElseThrow(() -> new RuntimeException("Bloc non trouvé"));

        List<Chambre> chambres = chambreRepository.findAllById(numChambres);
        if (chambres.isEmpty()) {
            throw new RuntimeException("Aucune chambre trouvée avec ces numéros");
        }

        for (Chambre chambre : chambres) {
            chambre.setBloc(bloc);
        }
        chambreRepository.saveAll(chambres);

        return bloc;
    }

}


