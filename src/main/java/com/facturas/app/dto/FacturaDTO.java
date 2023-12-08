package com.facturas.app.dto;

import com.facturas.app.dto.audit.AuditVariablesDTO;
import com.facturas.app.entity.TipoPago;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FacturaDTO extends AuditVariablesDTO {

    private Integer id;
    private Integer numeroFactura;
    private LocalDateTime fecha;
    private TipoPago tipoPago;
    private String documentoCliente;
    private String nombreCliente;
    private Integer subtotal;
    private Integer descuento;
    private Integer iva;
    private Integer totalDescuento;
    private Integer totalImpuesto;
    private Integer total;


}
