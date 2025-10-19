package com.apiProductos.cursoTDC.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//mapeamos la clase producto para que se genere en la bd
// los nombres de las tablas minuscula y singular
// @Data es de lombok es opcional no lo use aqui
// @Id indica PK en la tabla
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo_prodcuto;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "marca")
    private String marca;
    @Column(name = "costo")
    private Double costo;
    @Column(name = "cantidad")
    private int cantidad;

}
