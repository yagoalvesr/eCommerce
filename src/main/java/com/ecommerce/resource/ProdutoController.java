package com.ecommerce.resource;

import com.ecommerce.domain.Produto;
import com.ecommerce.domain.Produto;
import com.ecommerce.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Produto>> listarProdutos() {
        List<Produto> produtoList = produtoService.listarProdutos();
        return ResponseEntity.ok().body(produtoList);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Produto> recuperarProdutoPorId(@PathVariable Integer id) {
        Produto produto = produtoService.recuperarProdutoPorId(id);
        return ResponseEntity.ok().body(produto);
    }
}
