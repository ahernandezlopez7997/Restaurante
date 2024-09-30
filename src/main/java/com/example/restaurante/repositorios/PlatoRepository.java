package com.example.restaurante.repositorios;

import com.example.restaurante.modelos.Plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatoRepository extends JpaRepository<Plato, Integer> {
}
