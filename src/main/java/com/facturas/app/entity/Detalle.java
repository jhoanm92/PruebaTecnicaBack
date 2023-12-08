package com.facturas.app.entity;

import com.facturas.app.entity.AuditVariables.AuditVariables;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "detalles")
public class Detalle extends AuditVariables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_factura_fk", referencedColumnName = "id_factura")
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "id_producto_fk", referencedColumnName = "id_producto")
    private Producto producto;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "precio_unitario")
    private Integer precioUnitario;
}
