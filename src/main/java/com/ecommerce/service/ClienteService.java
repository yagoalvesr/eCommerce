package com.ecommerce.service;

import com.ecommerce.dao.ClienteDAO;
import com.ecommerce.domain.Cliente;
import com.ecommerce.domain.Retorno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteDAO clienteDAO;

    public List<Cliente> listarClientes() {
        return clienteDAO.findAll();
    }

    public Retorno inserirCliente(Cliente cliente) {
        Cliente clienteSalvo = clienteDAO.save(cliente);
        Retorno retorno = new Retorno();

        if (clienteSalvo != null) {
            retorno = new Retorno("Cliente salvo com sucesso!", true, "Created");
        }

        return retorno;
    }

    public Cliente obterCliente(String id) {
        return clienteDAO.findById(id).get();
    }

    public Retorno atualizarCliente(Cliente cliente) {
        Cliente clienteAtualizacao = obterCliente(cliente.getId());
        Cliente clienteSalvo = new Cliente();
        Retorno retorno = new Retorno();

        if (clienteAtualizacao != null) {
            atualizarDadosclien(cliente, clienteAtualizacao);
            clienteSalvo = clienteDAO.save(clienteAtualizacao);
        }

        if (clienteSalvo != null) {
            retorno = new Retorno("Cliente atualizado com sucesso!", true, "Created");
        }

        return retorno;
    }

    private void atualizarDadosclien(Cliente cliente, Cliente clienteAtualizacao) {
        clienteAtualizacao.setId(cliente.getId());
        clienteAtualizacao.setDataCadastro(cliente.getDataCadastro());
        clienteAtualizacao.setNome(cliente.getNome());
        clienteAtualizacao.setStatus(cliente.getStatus());
    }
}
