package com.facturas.app.service.impl;

import com.facturas.app.dto.FacturaDTO;
import com.facturas.app.entity.Factura;
import com.facturas.app.repository.FacturaRepository;
import com.facturas.app.repository.GenericRepository;
import com.facturas.app.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl extends CRUDimpl<Factura, FacturaDTO, Integer> implements FacturaService {

    @Autowired
    private FacturaRepository repository;

    @Override
    protected GenericRepository<Factura, Integer> getRepository() {
        return repository;
    }
}
