package com.example.tpfoyer.service;

import com.example.tpfoyer.entites.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{
    @Override
    public List<Reservation> retrieveAllReservation() {
        return null;
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return null;
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return null;
    }
}
