package com.facturas.app.mapper;

import com.facturas.app.dto.ProductoDTO;
import com.facturas.app.entity.Producto;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductoMapper extends GenericMapper<Producto, ProductoDTO>{


    @Override
    @Mappings({
            @Mapping(target = "dateCreation",ignore = true),
            @Mapping(target = "userCreation",ignore = true),
            @Mapping(target = "dateModification",ignore = true),
            @Mapping(target = "userModification",ignore = true)
    })
    Producto toEntity(ProductoDTO dto);

    @Override
    @Mappings({
            @Mapping(target = "dateCreation",ignore = true),
            @Mapping(target = "userCreation",ignore = true),
            @Mapping(target = "dateModification",ignore = true),
            @Mapping(target = "userModification",ignore = true)
    })
    ProductoDTO toDto(Producto enety);

    @Override
    List<Producto> toEntities(List<ProductoDTO> dtos);

    @Override
    List<ProductoDTO> toDtos(List<Producto> entities);
}
