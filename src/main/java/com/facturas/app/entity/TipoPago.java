package com.facturas.app.entity;

import com.facturas.app.entity.AuditVariables.AuditVariables;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tipo_de_Pago")
public class TipoPago extends AuditVariables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_de_pago")
    private Integer id;

    @Column(name = "tipo_pago")
    private String tipoPago;
}
