package com.apiProductos.cursoTDC.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//mapeamos la clase producto para que se genere en la bd
// los nombres de las tablas minuscula y singular
// @Data es de lombok es opcional no lo use aqui
// @Id indica PK en la tabla
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue
    private Long codigo_prodcuto;
    private String nombre;
    private String marca;
    private Double costo;
    private int cantidad;

}
