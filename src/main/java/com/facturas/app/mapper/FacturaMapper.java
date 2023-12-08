package com.facturas.app.mapper;

import com.facturas.app.dto.FacturaDTO;
import com.facturas.app.entity.Factura;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface FacturaMapper extends GenericMapper<Factura, FacturaDTO> {
}
