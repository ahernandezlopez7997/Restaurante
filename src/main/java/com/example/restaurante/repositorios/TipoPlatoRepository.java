package com.example.restaurante.repositorios;

import com.example.restaurante.modelos.TipoPlato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPlatoRepository extends JpaRepository<TipoPlato, Integer> {
}
