package com.apiProductos.cursoTDC.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
//@Entity
@NoArgsConstructor
public class Cliente {

    private Long id_cliente;
    private String nombre;
    private String apellido;
    private String dni;

}
