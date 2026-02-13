package com.jorgealvarez.cruds.controller;

import com.jorgealvarez.cruds.entity.Usuario;
import com.jorgealvarez.cruds.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiendahatelia/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/get")
    public List<Usuario> listar(){
        return usuarioService.listar();
    }

    @GetMapping("/get/{id}")
    public Usuario obtenerPorId(@PathVariable Integer id){
        return usuarioService.obtenerPorId(id);
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario crear(@RequestBody Usuario usuario){
        return usuarioService.crear(usuario);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id){
        usuarioService.eliminar(id);
    }

    @PutMapping("/put/{id}")
    public Usuario actualizar(@PathVariable Integer id, @RequestBody Usuario usuario){
        return usuarioService.actualizar(id, usuario);
    }
}
