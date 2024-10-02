package com.example.restaurante.servicios;

import com.example.restaurante.modelos.LineaBebida;
import com.example.restaurante.repositorios.LineaBebidaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LineaBebidaService {

    @Autowired
    private LineaBebidaRepository lineaBebidaRepository;

    public List<LineaBebida> getAll() {
        return lineaBebidaRepository.findAll();
    }

    public LineaBebida getById(int id) {
        return lineaBebidaRepository.findById(id).orElse(null);
    }

    public LineaBebida guardar(LineaBebida lineaBebida) {
        return lineaBebidaRepository.save(lineaBebida);
    }

    public void eliminar(int id) {
        lineaBebidaRepository.deleteById(id);
    }

}
