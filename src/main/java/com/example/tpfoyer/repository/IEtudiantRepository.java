package com.example.tpfoyer.repository;
import com.example.tpfoyer.entites.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEtudiantRepository extends JpaRepository<Etudiant, Integer> {

    Etudiant findByCin(long cinEtudiant);

}