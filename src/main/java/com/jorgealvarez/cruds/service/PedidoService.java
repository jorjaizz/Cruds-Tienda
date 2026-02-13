package com.jorgealvarez.cruds.service;

import com.jorgealvarez.cruds.entity.Pedido;
import java.util.List;

public interface PedidoService {
    List<Pedido> listar();
    Pedido obtenerPorId(Integer id);
    Pedido crear(Pedido pedido);
    Pedido actualizar(Integer id, Pedido pedido);
    void eliminar(Integer id);
}
