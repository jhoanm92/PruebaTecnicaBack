package com.facturas.app.dto;

import com.facturas.app.dto.audit.AuditVariablesDTO;
import lombok.Data;

@Data
public class TipoPagoDTO extends AuditVariablesDTO {

    private Integer id;
    private String tipoPago;
}
