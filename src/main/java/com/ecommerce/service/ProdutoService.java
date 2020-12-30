package com.ecommerce.service;

import com.ecommerce.dao.ProdutoDAO;
import com.ecommerce.domain.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoDAO produtoDAO;

    public List<Produto> listarProdutos() {
        return produtoDAO.findAll();
    }

}
