package com.example.restaurante.repositorios;

import com.example.restaurante.modelos.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BebidaRepository extends JpaRepository<Bebida, Integer> {
}
