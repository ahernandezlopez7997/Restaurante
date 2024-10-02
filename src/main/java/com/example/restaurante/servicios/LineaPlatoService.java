package com.example.restaurante.servicios;

import com.example.restaurante.modelos.LineaPlato;
import com.example.restaurante.repositorios.LineaPlatoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LineaPlatoService {

    @Autowired
    private LineaPlatoRepository lineaPlatoRepository;

    public List<LineaPlato> getAll() {
        return lineaPlatoRepository.findAll();
    }

    public LineaPlato getById(int id) {
        return lineaPlatoRepository.findById(id).orElse(null);
    }

    public LineaPlato guardar(LineaPlato lineaPlato) {
        return lineaPlatoRepository.save(lineaPlato);
    }

    public void eliminar(int id) {
        lineaPlatoRepository.deleteById(id);
    }
}
