package com.jorgealvarez.cruds.service;

import com.jorgealvarez.cruds.entity.Usuario;
import com.jorgealvarez.cruds.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario obtenerPorId(Integer id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado: " + id));
    }

    @Override
    public Usuario crear(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario actualizar(Integer id, Usuario usuario) {
        Usuario existente = obtenerPorId(id);

        existente.setNombreUsuario(usuario.getNombreUsuario());
        existente.setApellidoUsuario(usuario.getApellidoUsuario());
        existente.setEdadUsuario(usuario.getEdadUsuario());

        return usuarioRepository.save(existente);
    }

    @Override
    public void eliminar(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
