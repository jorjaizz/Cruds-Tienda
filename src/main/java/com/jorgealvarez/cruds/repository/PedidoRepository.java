package com.jorgealvarez.cruds.repository;

import com.jorgealvarez.cruds.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
