package com.apiProductos.cursoTDC.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "cliente")
public class Cliente {
    
    @Id()
    @Column(name = "id")
    private Long id_cliente;
    private String nombre;
    private String apellido;
    private String dni;

}
