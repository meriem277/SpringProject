package com.example.tpfoyer.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.tpfoyer.entites.Reservation;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservationRepository extends CrudRepository <Reservation,String> {
}
