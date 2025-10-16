package com.apiProductos.cursoTDC.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
//@Entity
public class Venta {

    @Id
    private Long codigo_venta;
    private LocalDate fecha_venta;
    private Double total;
    private List<Producto> listaProductos;

}
