package com.example.restaurante.servicios;

import com.example.restaurante.modelos.Cliente;
import com.example.restaurante.repositorios.ClienteRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteService {


    private ClienteRepository clienteRepository;

    /**
     * Busca clientes por dni
     *
     */

    public List<Cliente> getClientePorDNI(String dni){
        List<Cliente> clientes = clienteRepository.findAllByDniEquals(dni);
        return clientes;
    }

    /**
     * Busca todos los clientes
     */

    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }

    /**
     * Busca un cliente por id
     */

    public Cliente getById(int id){
        return clienteRepository.findById(id).orElse(null);
    }

    /**
     * Crea una empresa nueva o modifica una existente
     */

    public Cliente guardar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    /**
     * Elimina una empresa por id
     */

    public void eliminar(int id){
        clienteRepository.deleteById(id);
    }

    /**
     * Elimina una empresa
     */

    public void eliminar(Cliente cliente){
        clienteRepository.delete(cliente);
    }
}
