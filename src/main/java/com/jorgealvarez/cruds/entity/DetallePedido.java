package com.jorgealvarez.cruds.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Integer idDetalle;

    @NotNull
    @Column(name = "cantidad")
    private Integer cantidad;

    @NotNull
    @Column(name = "precio_unitario")
    private Double precioUnitario;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

}
