package com.jorgealvarez.cruds.repository;

import com.jorgealvarez.cruds.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
