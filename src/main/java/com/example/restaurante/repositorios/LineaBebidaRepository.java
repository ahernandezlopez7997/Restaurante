package com.example.restaurante.repositorios;

import com.example.restaurante.modelos.LineaBebida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineaBebidaRepository extends JpaRepository<LineaBebida, Integer> {
}
