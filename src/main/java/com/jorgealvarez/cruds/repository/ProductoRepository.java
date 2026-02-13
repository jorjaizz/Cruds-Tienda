package com.jorgealvarez.cruds.repository;

import com.jorgealvarez.cruds.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
