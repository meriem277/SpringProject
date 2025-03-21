package com.example.tpfoyer.service;

import com.example.tpfoyer.entites.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveBlocs();
    Bloc updateBloc (Bloc bloc);
    Bloc addBloc (Bloc bloc);
    Bloc retrieveBloc (long idBloc);
    void removeBloc (long idBloc);
    Bloc affecterChambresABloc(List<Long> numChambres, long idBloc);

}