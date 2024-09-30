package com.example.restaurante;

import com.example.restaurante.modelos.Cliente;
import com.example.restaurante.servicios.ClienteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RestauranteApplicationTests {

	@Autowired
	private ClienteService clienteService;

	@Test
	void testFindAllAptitudes(){

	}

}
