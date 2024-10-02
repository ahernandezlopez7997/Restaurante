package com.example.restaurante.servicios;

import com.example.restaurante.modelos.Plato;
import com.example.restaurante.repositorios.PlatoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlatoService {

    @Autowired
    private PlatoRepository platoRepository;

    /**
     * Este metodo extrae todos los platos de la base de datos
     * @return
     */
    public List<Plato> getAll() {
        return platoRepository.findAll();
    }

    /**
     * Este método extrae un plato por id
     * @param id
     * @return
     */
    public Plato getById(Integer id){
        return platoRepository.findById(id).orElse(null);
    }

    /**
     * Este metodo crea o editar platos en la base de datos
     * @param plato
     * @return
     */
    public Plato guardar(Plato plato){
        return platoRepository.save(plato);
    }

    /**
     * Este método elimina un plato por id
     * @param id
     */

    public void eliminar(Integer id){
        platoRepository.deleteById(id);
    }
}
