package com.apiProductos.cursoTDC.repository;

import com.apiProductos.cursoTDC.model.Producto;
import com.apiProductos.cursoTDC.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IVentaRepository extends JpaRepository <Venta, Long> {


}
