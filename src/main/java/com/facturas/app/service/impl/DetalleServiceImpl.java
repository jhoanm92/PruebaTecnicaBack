package com.facturas.app.service.impl;

import com.facturas.app.dto.DetalleDTO;
import com.facturas.app.entity.Detalle;
import com.facturas.app.repository.DetalleRepository;
import com.facturas.app.repository.GenericRepository;
import com.facturas.app.service.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleServiceImpl extends CRUDimpl<Detalle, DetalleDTO, Integer> implements DetalleService {

    @Autowired
    private DetalleRepository repository;

    @Override
    protected GenericRepository<Detalle, Integer> getRepository() {
        return repository;
    }
}
