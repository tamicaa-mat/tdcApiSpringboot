package com.apiProductos.cursoTDC.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    // no hace falta agregar la notacion @column en cada propiedad, a menos que quieras configurar algo en particular para cada columna,
    // como no configuraste nada solo le asignaste name, borre las anotaciones @column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo_producto;
    private String nombre;
    private String marca;
    private Double costo;
    private Integer cantidad;
    @ManyToOne
    @JoinColumn(name = "codigo_venta", nullable = true) // FK en la tabla producto agrego nullable true porque si quiero crear un producto
    // que aun no vendi entonces ese campo debe poder ser null sino tira error en postman

    private Venta orden;

}
