package com.facturas.app.service.impl;

import com.facturas.app.dto.TipoPagoDTO;
import com.facturas.app.entity.TipoPago;
import com.facturas.app.repository.GenericRepository;
import com.facturas.app.repository.TipoPagoRepository;
import com.facturas.app.service.TipoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoPagoServiceImpl extends CRUDimpl<TipoPago, TipoPagoDTO, Integer> implements TipoPagoService {

    @Autowired
    private TipoPagoRepository repository;

    @Override
    protected GenericRepository<TipoPago, Integer> getRepository() {
        return repository;
    }
}
