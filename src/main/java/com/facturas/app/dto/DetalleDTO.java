package com.facturas.app.dto;

import com.facturas.app.dto.audit.AuditVariablesDTO;
import com.facturas.app.entity.Factura;
import com.facturas.app.entity.Producto;
import lombok.Data;

@Data
public class DetalleDTO extends AuditVariablesDTO {

    private Integer id;
    private Factura factura;
    private Producto producto;
    private Integer cantidad;
    private Integer precioUnitario;
}
