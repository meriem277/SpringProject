package com.example.tpfoyer.repository;

import com.example.tpfoyer.entites.Chambre;
import com.example.tpfoyer.entites.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IChambreRepository extends JpaRepository<Chambre, Long> {

    @Query("SELECT c FROM Chambre c " +
            "WHERE c.bloc.foyer.universite.nomUniversite = :nomUniversite " +
            "AND c.typeC = :type " +
            "AND c.reservations IS EMPTY")
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type);

    @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :idBloc AND c.typeC = :type")
    public List<Chambre> getChambresParBlocEtType(Long idBloc, TypeChambre type);

    List<Chambre> findByBlocIdBlocAndTypeC(Long blocIdBloc, TypeChambre typeC);
    List<Chambre> findByBloc_IdBloc(long idBloc);


}

