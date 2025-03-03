package com.example.tpfoyer.repository;

import com.example.tpfoyer.entites.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChambreRepository extends JpaRepository<Chambre, Long> {
}
