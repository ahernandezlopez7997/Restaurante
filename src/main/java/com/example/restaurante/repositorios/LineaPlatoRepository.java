package com.example.restaurante.repositorios;

import com.example.restaurante.modelos.LineaPlato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineaPlatoRepository extends JpaRepository<LineaPlato, Integer> {
}
