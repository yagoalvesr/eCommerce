package com.ecommerce.resource;

import com.ecommerce.domain.Pedido;
import com.ecommerce.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Pedido>> listarPedidos() {
        List<Pedido> pedidoList = pedidoService.listarPedidos();
        return ResponseEntity.ok().body(pedidoList);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Pedido> recuperarPedidoPorId(@PathVariable Integer id) {
        Pedido pedido = pedidoService.recuperarPedidoPorId(id);
        return ResponseEntity.ok().body(pedido);
    }

}
