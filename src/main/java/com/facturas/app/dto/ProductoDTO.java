package com.facturas.app.dto;

import com.facturas.app.dto.audit.AuditVariablesDTO;
import com.facturas.app.entity.Detalle;
import lombok.Data;

@Data
public class ProductoDTO extends AuditVariablesDTO {

    private Integer id;
    private String producto;
}
