package com.facturas.app.service.impl;

import com.facturas.app.dto.ProductoDTO;
import com.facturas.app.entity.Producto;
import com.facturas.app.repository.GenericRepository;
import com.facturas.app.repository.ProductoRepositiry;
import com.facturas.app.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl extends CRUDimpl<Producto, ProductoDTO, Integer> implements ProductoService {

    @Autowired
    private ProductoRepositiry repository;

    @Override
    protected GenericRepository<Producto, Integer> getRepository() {
        return repository;
    }
}
