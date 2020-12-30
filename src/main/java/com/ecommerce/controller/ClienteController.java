package com.ecommerce.controller;

import com.ecommerce.domain.Cliente;
import com.ecommerce.domain.Retorno;
import com.ecommerce.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @RequestMapping(value = "/listarClientes", method = RequestMethod.GET)
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    @RequestMapping(value = "/inserirClientes", method = RequestMethod.POST)
    public Retorno inserirCliente(@RequestBody Cliente cliente) {
        return clienteService.inserirCliente(cliente);
    }

    @RequestMapping(value = "/obterCliente/{id}", method = RequestMethod.GET)
    public Cliente obterCliente(@PathVariable String id) {
        return clienteService.obterCliente(id);
    }


}
