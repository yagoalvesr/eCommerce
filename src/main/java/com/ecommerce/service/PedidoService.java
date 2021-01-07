package com.ecommerce.service;

import com.ecommerce.dao.PedidoDAO;
import com.ecommerce.domain.Categoria;
import com.ecommerce.domain.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    PedidoDAO pedidoDAO;

    public List<Pedido> listarPedidos() {
        return pedidoDAO.findAll();
    }

    public Pedido recuperarPedidoPorId(Integer id) {
        return pedidoDAO.findById(id).get();
    }

}
