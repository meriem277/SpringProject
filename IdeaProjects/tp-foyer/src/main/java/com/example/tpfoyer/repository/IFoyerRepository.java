package com.example.tpfoyer.repository;

import com.example.tpfoyer.entites.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoyerRepository extends JpaRepository <Foyer,Long> {
}
