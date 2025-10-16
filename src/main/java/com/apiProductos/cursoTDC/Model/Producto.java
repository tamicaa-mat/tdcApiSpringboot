package com.apiProductos.cursoTDC.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//mapeamos la clase producto para que se genere en la bd
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Producto {

    private Long codigo_prodcuto;
    private String nombre;
    private String marca;
    private Double costo;
    private Double cantidad;

    public Producto() {
    }


}
