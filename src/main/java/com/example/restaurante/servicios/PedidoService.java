package com.example.restaurante.servicios;

import com.example.restaurante.modelos.Pedido;
import com.example.restaurante.repositorios.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    /**
     * Metodo para obtener una lista con todos los pedidos
     * @return
     */
    public List<Pedido> getAll() {
        return pedidoRepository.findAll();
    }

    /**
     * metodo para obtener pedido por id
     * @param id
     * @return
     */
    public Pedido getById(int id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    /**
     * metodo para crear o editar pedidos
     * @param pedido
     * @return
     */
    public Pedido guardar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    /**
     * metodo para eliminar pedidos por id
     * @param id
     */
    public void eliminar(int id) {
        pedidoRepository.deleteById(id);
    }
}
