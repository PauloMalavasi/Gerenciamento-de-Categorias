package com.ph.categorias.Service;

import com.ph.categorias.Entity.CategoriaEntity;
import com.ph.categorias.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    public CategoriaRepository categoriaRepository;

    public List<CategoriaEntity> findAll(){
        return categoriaRepository.findAll();
    }

    public CategoriaEntity create(CategoriaEntity categoriaEntity){
        return categoriaRepository.save(categoriaEntity);
    }

    public void delete(Long id){
        categoriaRepository.deleteById(id);
    }

    public Optional<CategoriaEntity> findId(Long id){
        return categoriaRepository.findById(id);
    }
}
