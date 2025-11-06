package com.apiProductos.cursoTDC.dto;

import com.apiProductos.cursoTDC.model.Venta;
import lombok.Data;

@Data
public class ProductoDto {

    private Long codigo_producto;
    private String nombre;
    private String marca;
    private Double costo;
    private Integer cantidad;

   // private Long codigo_venta; no estoy segura

}
