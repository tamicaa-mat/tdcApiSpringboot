package com.apiProductos.cursoTDC.dto;

import lombok.Data;
@Data
public class ClienteDto {

    private Long codigo_cliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String telefono;
    private String direccion;

}
