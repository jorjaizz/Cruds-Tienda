package com.jorgealvarez.cruds.service;

import com.jorgealvarez.cruds.entity.DetallePedido;

import java.util.List;

public interface DetallePedidoService {
    List<DetallePedido> listar();
    DetallePedido obtenerPorId(Integer id);
    DetallePedido crear(DetallePedido detallePedido);
    DetallePedido actualizar(Integer id, DetallePedido detallePedido);
    void eliminar(Integer id);
}
