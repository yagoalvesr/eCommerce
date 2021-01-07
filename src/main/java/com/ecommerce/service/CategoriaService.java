package com.ecommerce.service;

import com.ecommerce.dao.CategoriaDAO;
import com.ecommerce.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    CategoriaDAO categoriaDAO;

    public List<Categoria> listarCategorias() {
        return categoriaDAO.findAll();
    }

    public Categoria recuperarCategoriaPorId(Integer id) {
        return categoriaDAO.findById(id).get();
    }

}
