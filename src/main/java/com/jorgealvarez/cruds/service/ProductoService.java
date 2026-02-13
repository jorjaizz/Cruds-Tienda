package com.jorgealvarez.cruds.service;

import com.jorgealvarez.cruds.entity.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> listar();
    Producto obtenerPorId(Integer id);
    Producto crear(Producto producto);
    Producto actualizar(Integer id, Producto producto);
    void eliminar(Integer id);
}
