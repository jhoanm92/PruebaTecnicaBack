package com.facturas.app.mapper;

import com.facturas.app.dto.TipoPagoDTO;
import com.facturas.app.entity.TipoPago;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipoPagoMapper extends GenericMapper<TipoPago, TipoPagoDTO> {
}
