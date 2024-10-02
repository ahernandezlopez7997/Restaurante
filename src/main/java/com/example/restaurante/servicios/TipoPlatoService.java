package com.example.restaurante.servicios;

import com.example.restaurante.modelos.TipoPlato;
import com.example.restaurante.repositorios.TipoPlatoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TipoPlatoService {

    @Autowired
    private TipoPlatoRepository tipo_platoRepository;

    /**
     * Este método extrae todos los tipos de platos.
     * @return
     */
    public List<TipoPlato> getAll(){
        return tipo_platoRepository.findAll();
    }

    /**
     * Este método extrae un tipo_plato por id
     * @param id
     * @return
     */
    public TipoPlato getById(int id){
        return tipo_platoRepository.findById(id).orElse(null);
    }

    /**
     * Método para crear o editar tipos de platos
     * @param tipo_plato
     * @return
     */
    public TipoPlato guardar(TipoPlato tipo_plato){
        return tipo_platoRepository.save(tipo_plato);
    }

    /**
     * Método para eliminar un tipo_plato por id
     * @param id
     */
    public void eliminar(int id){
        tipo_platoRepository.deleteById(id);
    }
}
