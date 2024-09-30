package com.example.restaurante.repositorios;

import com.example.restaurante.modelos.Tipo_plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tipo_platoRepository extends JpaRepository<Tipo_plato, Integer> {
}
