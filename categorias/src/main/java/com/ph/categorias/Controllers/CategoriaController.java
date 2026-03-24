package com.ph.categorias.Controllers;


import com.ph.categorias.Entity.CategoriaEntity;
import com.ph.categorias.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    public CategoriaService categoriaService;

    @PostMapping
    public CategoriaEntity create(@RequestBody CategoriaEntity categoriaEntity){
        return categoriaService.create(categoriaEntity);
    }

    @GetMapping
    public List<CategoriaEntity> findAll(){
        return categoriaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CategoriaEntity> findById(@PathVariable Long id){
        return categoriaService.findId(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        categoriaService.delete(id);
    }
}
