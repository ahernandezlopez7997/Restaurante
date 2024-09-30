package com.example.restaurante.repositorios;

import com.example.restaurante.modelos.Linea_bebida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Linea_BebidaRepository extends JpaRepository<Linea_bebida, Integer> {
}
