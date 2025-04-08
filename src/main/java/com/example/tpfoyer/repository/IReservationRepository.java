package com.example.tpfoyer.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.tpfoyer.entites.Reservation;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IReservationRepository extends JpaRepository <Reservation,String> {


        @Query("SELECT r FROM Reservation r " +
                "WHERE r.anneeUniversitaie = :givenYear " +
                "AND r.bloc.foyer.universite.nomUniversite = :nomUniv")
        public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date givenYear, String nomUniv);
    List<Reservation> findByChambreIdchambre(long idChambre);  // Correction ici
    }

