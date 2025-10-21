package com.apiProductos.cursoTDC.service;

import com.apiProductos.cursoTDC.model.Cliente;
import com.apiProductos.cursoTDC.model.Producto;
import com.apiProductos.cursoTDC.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public interface IVentaService {

    List<Venta> getVentas();

    void saveVenta(Venta v);

    void deleteVenta(Long codigoVenta);


    Venta findById(Long id);

    //falta el metodo modificacion de producto
    void editVenta(Long codigo, Long codigoNuevo, LocalDate fecha, Double total, List<Venta> ventas);


}
