package com.example.restaurante.servicios;

import com.example.restaurante.modelos.Cliente;
import com.example.restaurante.repositorios.ClienteRepository;
import lombok.AllArgsConstructor;
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

    public List<Cliente> getClientePorDNI(String dni, String nombre){
        List<Cliente> clientes = clienteRepository.findAllByDniEquals(dni,nombre);
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

}
