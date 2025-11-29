package com.apiProductos.cursoTDC.service;

import com.apiProductos.cursoTDC.dto.VentaDto;
import com.apiProductos.cursoTDC.model.Cliente;
import com.apiProductos.cursoTDC.model.Producto;
import com.apiProductos.cursoTDC.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public interface IVentaService {

    List<VentaDto> getVentas();

     Venta saveVenta(VentaDto v);

    void deleteVenta(Long codigoVenta);


    Venta findById(Long id);


}
