package com.example.tpfoyer.repository;

import com.example.tpfoyer.entites.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUniversiteRepository extends JpaRepository<Universite, Long>

    {
        Optional<Universite> findByNom(String nom);
        Optional<Universite> findById(Long id);


    }
