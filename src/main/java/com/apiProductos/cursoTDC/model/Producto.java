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

    // no hace falta agregar la notacion @column en cada propiedad, a menos que quieras configurar algo en particular para cada columna,
    // como no configuraste nada solo le asignaste name, borre las anotaciones @column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo_prodcuto;
    private String nombre;
    private String marca;
    private Double costo;
    private int cantidad;
    @ManyToOne
    @JoinColumn(name = "codigo_venta") // FK en la tabla producto
    private Venta orden;



}
