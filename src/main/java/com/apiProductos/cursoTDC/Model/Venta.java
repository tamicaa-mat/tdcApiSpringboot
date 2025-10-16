package com.apiProductos.cursoTDC.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Venta {

   private Long codigo_venta;
   private LocalDate fecha_venta;
   private Double total;
   private List<Producto> listaProductos;

    public Venta() {
    }
}
