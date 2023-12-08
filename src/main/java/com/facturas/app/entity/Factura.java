package com.facturas.app.entity;

import com.facturas.app.entity.AuditVariables.AuditVariables;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "facturas")
public class Factura extends AuditVariables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer id;

    @Column(name = "numero_factura")
    private Integer numeroFactura;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "id_tipo_de_pago_fk", referencedColumnName = "id_tipo_de_pago")
    private TipoPago tipoPago;

    @Column(name = "documento_client")
    private String documentoCliente;

    @Column(name = "nombre_cliente")
    private String nombreCliente;

    @Column(name = "subtotal")
    private Integer subtotal;

    @Column(name = "descuento")
    private Integer descuento;

    @Column(name = "iva")
    private Integer iva;

    @Column(name = "total_descuento")
    private Integer totalDescuento;

    @Column(name = "total_impuesto")
    private Integer totalImpuesto;

    @Column(name = "total")
    private Integer total;
}
