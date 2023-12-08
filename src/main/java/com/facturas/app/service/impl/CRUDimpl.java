package com.facturas.app.service.impl;

import com.facturas.app.dto.audit.AuditVariablesDTO;
import com.facturas.app.dto.audit.AuditWrite;
import com.facturas.app.exception.ModeloNotFoundException;
import com.facturas.app.mapper.GenericMapper;
import com.facturas.app.repository.GenericRepository;
import com.facturas.app.service.CRUD;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class CRUDimpl<T, D extends AuditVariablesDTO, ID> implements CRUD<D, ID> {

    @Autowired
    protected abstract GenericRepository<T, ID> getRepository();

    @Autowired
    private GenericMapper<T, D> mapper;

    @Autowired
    private AuditWrite<D> auditWrite;

    @Override
    public D register(D dto) {
        auditWrite.creation(dto);
        return mapper.toDto(getRepository().save(mapper.toEntity(dto)));
    }

    @Override
    public D update(D dto) {
        auditWrite.modofication(dto);
        return mapper.toDto(getRepository().save(mapper.toEntity(dto)));
    }

    @Override
    public List<D> getAll() {
        return mapper.toDtos(getRepository().findAll());
    }

    @Override
    public D getById(ID id) {
        return getRepository().findById(id)
                .map(x -> mapper.toDto(x))
                .orElseThrow(() -> new ModeloNotFoundException("ID NO ENCONTRADO " + id));
    }

    @Override
    public void delete(ID id) {
        getById(id);
        getRepository().deleteById(id);
    }
}