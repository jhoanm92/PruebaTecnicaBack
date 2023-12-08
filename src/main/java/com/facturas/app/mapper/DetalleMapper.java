package com.facturas.app.mapper;

import com.facturas.app.dto.DetalleDTO;
import com.facturas.app.entity.Detalle;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DetalleMapper extends GenericMapper<Detalle, DetalleDTO> {
}
