package com.example.tpfoyer.service;

import com.example.tpfoyer.entites.Chambre;
import com.example.tpfoyer.entites.Etudiant;
import com.example.tpfoyer.entites.Reservation;
import com.example.tpfoyer.entites.TypeChambre;
import com.example.tpfoyer.repository.IChambreRepository;
import com.example.tpfoyer.repository.IEtudiantRepository;
import com.example.tpfoyer.repository.IReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service

public class ReservationService implements IReservationService{

    @Autowired
    IReservationRepository reservationRepository;
    @Autowired
    private IChambreRepository chambreRepository;

    @Autowired
    private IEtudiantRepository etudiantRepository;

    @Override
    public List<Reservation> retrieveAllReservation() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepository.save(res);    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);    }


    @Override
    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversitaie, String nomUniversite) {
        return reservationRepository.getReservationParAnneeUniversitaireEtNomUniversite(anneeUniversitaie,nomUniversite);
    }

    @Override
    public Reservation createReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    public Reservation ajouterReservation(long idBloc, long cin) {
        // Récupérer l'étudiant
        Etudiant etudiant = etudiantRepository.findByCin(cin);

        // Récupérer la chambre en fonction du bloc (Assumer que chaque bloc contient des chambres)
        Optional<Chambre> optionalChambre = chambreRepository.findById(idBloc);

        if (optionalChambre.isPresent()) {
            Chambre chambre = optionalChambre.get(); // Accéder à la chambre si présente

            // Vérifier la capacité de la chambre
            int capacitéActuelle = reservationRepository.findByChambreIdchambre (chambre.getIdChambre()).size();
            if ((chambre.getTypeC() == TypeChambre.SIMPLE && capacitéActuelle >= 1) ||
                    (chambre.getTypeC() == TypeChambre.DOUBLE && capacitéActuelle >= 2) ||
                    (chambre.getTypeC() == TypeChambre.TRIPLE && capacitéActuelle >= 3)) {
                throw new IllegalStateException("Capacité maximale de la chambre atteinte");
            }

            // Créer le numéro de réservation
            String numReservation = chambre.getNumeroChambre() + "-" + chambre.getBloc() + "-" + "2025";  // Supposons 2025 comme année universitaire

            // Créer la réservation
            Reservation reservation = new Reservation();
            reservation.setIdReservation(numReservation);
            reservation.setEtudiants(List.of(etudiant));
            reservation.setChambre(chambre);
            reservation.setEstValide(true);

            // Sauvegarder la réservation
            return reservationRepository.save(reservation);

        } else {
            throw new IllegalArgumentException("Chambre ou bloc invalide");
        }
    }}
