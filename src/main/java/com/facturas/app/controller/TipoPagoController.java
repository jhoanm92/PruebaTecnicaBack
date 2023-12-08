package com.facturas.app.controller;

import com.facturas.app.dto.ResponseDTO;
import com.facturas.app.dto.TipoPagoDTO;
import com.facturas.app.service.TipoPagoService;
import com.facturas.app.service.impl.TipoPagoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo-pagos")
public class TipoPagoController {

    private static final Logger log = LoggerFactory.getLogger(TipoPagoController.class);

    @Autowired
    private TipoPagoService service;

    @GetMapping()
    public ResponseEntity<ResponseDTO<List<TipoPagoDTO>>> getAll() {
        log.info("REST - To get all");
        return ResponseEntity.ok(new ResponseDTO<>(0, service.getAll(), "All Elements", "OK"));
    }

//    @PostMapping()
//    public ResponseEntity<ResponseDTO<TiendaDTO>> register(@RequestBody TiendaDTO dto) {
//        log.info("REST - Request to register : {}", dto);
//        return ResponseEntity.ok(new ResponseDTO<>(0, service.register(dto), "Created Element", "OK"));
//    }
//
//    @PutMapping()
//    public ResponseEntity<ResponseDTO<TiendaDTO>> update(@RequestBody TiendaDTO personaDTO) {
//        log.info("REST - Request to update : {}", personaDTO);
//        return new ResponseEntity<>(new ResponseDTO<>(0, service.update(personaDTO), "Update Element", "OK"), HttpStatus.CREATED);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<ResponseDTO<TiendaDTO>> getById(@PathVariable("id") Integer id) {
//        log.info("REST - Get with Id : {}", id);
//        return ResponseEntity.ok(new ResponseDTO<>(0, service.getById(id), "Found Element", "OK"));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<ResponseDTO> delete(@PathVariable("id") Integer id) {
//        log.info("REST - Delete with id: {}", id);
//        service.delete(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
}
