package com.example.restaurante.repositorios;

import com.example.restaurante.modelos.Linea_plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Linea_PlatoRepository extends JpaRepository<Linea_plato, Integer> {
}
