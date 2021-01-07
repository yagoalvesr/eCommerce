package com.ecommerce.resource;

import com.ecommerce.domain.Categoria;
import com.ecommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Categoria>> listarCategorias() {
        List<Categoria> categoriaList = categoriaService.listarCategorias();
        return ResponseEntity.ok().body(categoriaList);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Categoria> recuperarCategoriaPorId(@PathVariable Integer id) {
        Categoria categoria = categoriaService.recuperarCategoriaPorId(id);
        return ResponseEntity.ok().body(categoria);
    }


}
