package com.apiProductos.cursoTDC.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//mapeamos la clase producto para que se genere en la bd
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity
public class Producto {

    private Long codigo_prodcuto;
    private String nombre;
    private String marca;
    private Double costo;
    private int cantidad;

}
