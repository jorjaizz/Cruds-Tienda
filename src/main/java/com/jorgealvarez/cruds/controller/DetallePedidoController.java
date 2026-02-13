package com.jorgealvarez.cruds.controller;

import com.jorgealvarez.cruds.entity.DetallePedido;
import com.jorgealvarez.cruds.service.DetallePedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiendahatelia/detallepedido")
public class DetallePedidoController {
    private final DetallePedidoService detallePedidoService;

    public DetallePedidoController(DetallePedidoService detallePedidoService) {
        this.detallePedidoService = detallePedidoService;
    }

    @GetMapping("/get")
    public List<DetallePedido> listar(){
        return detallePedidoService.listar();
    }

    @GetMapping("/get/{id}")
    public DetallePedido obtenerPorId(@PathVariable Integer id){
        return detallePedidoService.obtenerPorId(id);
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public DetallePedido crear(@RequestBody DetallePedido detallePedido){
        return detallePedidoService.crear(detallePedido);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id){
        detallePedidoService.eliminar(id);
    }

    @PutMapping("/put/{id}")
    public DetallePedido actualizar(@PathVariable Integer id, @RequestBody DetallePedido detallePedido){
        return detallePedidoService.actualizar(id, detallePedido);
    }


}
