package com.facturas.app.entity;

import com.facturas.app.entity.AuditVariables.AuditVariables;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "productos")
public class Producto extends AuditVariables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer id;

    @Column(name = "producto")
    private String producto;
}
