package com.apiProductos.cursoTDC.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@Table
@ToString
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_cliente;
    private String nombre;
    private String apellido;
    private String dni;

 // el cliente tiene una lista con tdas sus compras
    @OneToMany(mappedBy = "cliente")
    private List<Venta> ventas;

}
