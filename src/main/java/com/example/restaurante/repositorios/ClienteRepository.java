package com.example.restaurante.repositorios;


import com.example.restaurante.modelos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    //JPA Interface select * from cliente where dni = "" and nombre like '% %'

    List<Cliente> findAllByDniEquals(String dni);

}
