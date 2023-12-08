package com.facturas.app.controller;

import com.facturas.app.dto.ProductoDTO;
import com.facturas.app.dto.ResponseDTO;
import com.facturas.app.dto.TipoPagoDTO;
import com.facturas.app.service.ProductoService;
import com.facturas.app.service.TipoPagoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductosController {

    private static final Logger log = LoggerFactory.getLogger(ProductosController.class);

    @Autowired
    private ProductoService service;

    @GetMapping()
    public ResponseEntity<ResponseDTO<List<ProductoDTO>>> getAll() {
        log.info("REST - To get all");
        return ResponseEntity.ok(new ResponseDTO<>(0, service.getAll(), "All Elements", "OK"));
    }
}
