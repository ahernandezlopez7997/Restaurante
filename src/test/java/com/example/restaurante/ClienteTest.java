package com.example.restaurante;

import com.example.restaurante.modelos.Cliente;
import com.example.restaurante.servicios.ClienteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ClienteTest {

    @Autowired
    private ClienteService clienteService;

    @Test
    void testCrearCliente(){

        Cliente cliente = new Cliente();
        cliente.setNombre("Alberto");
        cliente.setApellido("Martinez");
        cliente.setEmail("Alberto@gmail.com");
        cliente.setTelefono("123456789");
        cliente.setDni("321654987N");
        Cliente clienteGuardado = clienteService.guardar(cliente);
        System.out.println(clienteGuardado.toString());
    }

    @Test
    void testEditarCliente(){
        Cliente cliente = clienteService.getById(1);
        cliente.setNombre("Antonio");
        cliente.setApellido("Hernández");
        cliente.setEmail("antonio@gmail.com");
        cliente.setTelefono("123456789");
        cliente.setDni("321654987N");
        Cliente clienteGuardado = clienteService.guardar(cliente);
        System.out.println(clienteGuardado.toString());
    }

    @Test
    void testEliminarCliente(){
        clienteService.eliminar(3);
    }

    @Test
    void testBuscarTodosLosClientes(){
        List<Cliente> clientes = clienteService.getAll();
        for (Cliente c : clientes){
            System.out.println(c.getNombre());
        }
    }
}
