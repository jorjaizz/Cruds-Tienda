package com.jorgealvarez.cruds.controller;

import com.jorgealvarez.cruds.entity.Pedido;
import com.jorgealvarez.cruds.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiendahatelia/pedidocontroller")
public class PedidoController {
    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/get")
    public List<Pedido> listar(){
        return pedidoService.listar();
    }

    @GetMapping("/get/{id}")
    public Pedido obtenerPorId(@PathVariable Integer id){
        return pedidoService.obtenerPorId(id);
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public Pedido crear(@RequestBody Pedido pedido){
        return pedidoService.crear(pedido);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id){
        pedidoService.eliminar(id);
    }

    @PutMapping("/put/{id}")
    public Pedido actualizar(@PathVariable Integer id, @RequestBody Pedido pedido){
        return pedidoService.actualizar(id, pedido);
    }

}
