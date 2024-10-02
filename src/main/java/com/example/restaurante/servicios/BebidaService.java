package com.example.restaurante.servicios;

import com.example.restaurante.modelos.Bebida;
import com.example.restaurante.repositorios.BebidaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BebidaService {

    @Autowired
    private BebidaRepository bebidaRepository;

    /**
     * metodo para tener una lista con todas las bebidas
     * @return
     */
    public List<Bebida> getAll() {
        return bebidaRepository.findAll();
    }

    /**
     * Método para obtener bebida por id
     * @param id
     * @return
     */
    public Bebida getById(int id) {
        return bebidaRepository.findById(id).orElse(null);
    }

    /**
     * Metodo para crear o editar bebidas
     * @param bebida
     * @return
     */
    public Bebida guardar(Bebida bebida) {
        return bebidaRepository.save(bebida);
    }

    /**
     * Metodo para eliminar bebida por id
     * @param id
     */
    public void eliminar(int id) {
        bebidaRepository.deleteById(id);
    }
}
