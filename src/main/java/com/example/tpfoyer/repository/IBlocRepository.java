package com.example.tpfoyer.repository;

import com.example.tpfoyer.entites.Bloc;
import com.example.tpfoyer.entites.Chambre;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlocRepository extends JpaRepository<Bloc, Long> {

}