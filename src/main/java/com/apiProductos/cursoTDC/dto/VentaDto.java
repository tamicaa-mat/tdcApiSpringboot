package com.apiProductos.cursoTDC.dto;

import com.apiProductos.cursoTDC.model.Producto;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

@Data
public class VentaDto {


    private Long codigoVenta;
    private LocalDate fechaVenta;
    private Double total;

    private List<ProductoDto> productos;
    private ClienteDto cliente;

}
