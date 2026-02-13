package com.jorgealvarez.cruds.repository;

import com.jorgealvarez.cruds.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
