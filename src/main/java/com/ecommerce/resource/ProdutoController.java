package com.ecommerce.resource;

import com.ecommerce.domain.Produto;
import com.ecommerce.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }

}
