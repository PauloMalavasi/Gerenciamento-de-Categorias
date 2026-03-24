package com.ph.categorias.Repository;

import com.ph.categorias.Entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository <CategoriaEntity, Long> {
}
