package com.jorgealvarez.cruds.service;

import com.jorgealvarez.cruds.entity.Pedido;
import com.jorgealvarez.cruds.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl implements  PedidoService{

    private final PedidoRepository pedidoRepository;

    public PedidoServiceImpl(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }

    @Override
    public Pedido obtenerPorId(Integer id) {
        return pedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("Pedido no encontrado: " + id));
    }

    @Override
    public Pedido crear(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public Pedido actualizar(Integer id, Pedido pedido) {
        Pedido existente = obtenerPorId(id);

        existente.setFechaPedido(pedido.getFechaPedido());
        existente.setTotalPedido(pedido.getTotalPedido());
        existente.setUsuario(pedido.getUsuario());

        return pedidoRepository.save(existente);
    }

    @Override
    public void eliminar(Integer id) {
        pedidoRepository.deleteById(id);
    }
}
