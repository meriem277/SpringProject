package com.example.tpfoyer.controller;

import com.example.tpfoyer.entites.Reservation;
import com.example.tpfoyer.service.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationController {
    IReservationService reservationService;
    @GetMapping("/getAll")
    public List<Reservation> getAll(){
        return reservationService.retrieveAllReservation();
    }
    @PutMapping("/{id}")
    public Reservation updateReservation(@PathVariable String id, @RequestBody Reservation r) {
        return reservationService.updateReservation(r);
    }

    @GetMapping("/{id}")
    public Reservation retrieveReservation(@PathVariable String id) {
        return reservationService.retrieveReservation(id);
    }

}