package com.ecommerce.service;

import com.ecommerce.dao.ClienteDAO;
import com.ecommerce.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteDAO clienteDAO;

    public List<Cliente> listarClientes() {
        return clienteDAO.findAll();
    }

    public Cliente recuperarClientePorId(Integer id) {
        return clienteDAO.findById(id).get();
    }

    public void inserirCliente(Cliente cliente) {
        clienteDAO.save(cliente);
    }
}
