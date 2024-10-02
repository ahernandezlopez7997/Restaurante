package com.example.restaurante.servicios;

import com.example.restaurante.modelos.Mesa;
import com.example.restaurante.repositorios.MesaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MesaService {

    @Autowired
    private MesaRepository mesaRepository;

    /**
     * metodo para obtener lista de todas las mesas
     * @return
     */
    public List<Mesa> getAll(){
        return mesaRepository.findAll();
    }

    /**
     * metodo para obtener mesa por id
     * @param id
     * @return
     */
    public Mesa getById(int id){
        return mesaRepository.findById(id).orElse(null);
    }

    /**
     * metodo para crear o editar mesas
     * @param mesa
     * @return
     */
    public Mesa guardar(Mesa mesa){
        return mesaRepository.save(mesa);
    }

    /**
     * metodo para eliminar mesa por id
     * @param id
     */
    public void eliminar(int id){
        mesaRepository.deleteById(id);
    }
}
