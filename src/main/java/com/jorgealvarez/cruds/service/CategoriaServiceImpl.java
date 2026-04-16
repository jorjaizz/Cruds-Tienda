package com.jorgealvarez.cruds.service;

import com.jorgealvarez.cruds.entity.Categoria;
import com.jorgealvarez.cruds.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria obtenerPorId(Integer id) {
        return categoriaRepository.findById(id).orElseThrow(() -> new RuntimeException("Categoria no encontrada: " + id));
    }

    @Override
    public Categoria crear(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria actualizar(Integer id, Categoria categoria) {
        Categoria existente = obtenerPorId(id);

        existente.setDescripcionCategoria(categoria.getDescripcionCategoria());
        existente.setNombreCategoria(categoria.getNombreCategoria());
        return categoriaRepository.save(categoria);
    }

    @Override
    public void eliminar(Integer id) {
        categoriaRepository.deleteById(id);
    }
}
