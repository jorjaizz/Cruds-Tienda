package com.jorgealvarez.cruds.service;

import com.jorgealvarez.cruds.entity.DetallePedido;
import com.jorgealvarez.cruds.repository.DetallePedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoServiceImpl implements DetallePedidoService{

    private final DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoServiceImpl(DetallePedidoRepository detallePedidoRepository) {
        this.detallePedidoRepository = detallePedidoRepository;
    }

    @Override
    public List<DetallePedido> listar() {
        return detallePedidoRepository.findAll();
    }

    @Override
    public DetallePedido obtenerPorId(Integer id) {
        return detallePedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("DetallePedido no encontrado: " + id));
    }

    @Override
    public DetallePedido crear(DetallePedido detallePedido) {
        return detallePedidoRepository.save(detallePedido);
    }

    @Override
    public DetallePedido actualizar(Integer id, DetallePedido detallePedido) {
        DetallePedido existente = obtenerPorId(id);

        existente.setCantidad(detallePedido.getCantidad());
        existente.setPrecioUnitario(detallePedido.getPrecioUnitario());
        existente.setPedido(detallePedido.getPedido());
        existente.setProducto(detallePedido.getProducto());

        return detallePedidoRepository.save(existente);
    }

    @Override
    public void eliminar(Integer id) {
        detallePedidoRepository.deleteById(id);
    }
}
