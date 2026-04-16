package com.jorgealvarez.cruds.controller;

import com.jorgealvarez.cruds.entity.Producto;
import com.jorgealvarez.cruds.service.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiendahatelia/producto")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> listar(){
        return productoService.listar();
    }

    @GetMapping("/{id}")
    public Producto obtenerPorId(@PathVariable Integer id){
        return productoService.obtenerPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Producto crear(@RequestBody Producto producto){
        return productoService.crear(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        productoService.eliminar(id);
    }

    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Integer id, @RequestBody Producto producto){
        return productoService.actualizar(id, producto);
    }

}
