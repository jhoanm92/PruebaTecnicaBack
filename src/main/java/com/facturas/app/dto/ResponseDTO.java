package com.facturas.app.dto;

import lombok.Data;

@Data
public class ResponseDTO<T> {

    private int codigo;
    private T data;
    private String mensaje;
    private String status;

    public ResponseDTO(int codigo,  T data, String mensaje, String status) {
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.data = data;
        this.status = status;
    }
}
