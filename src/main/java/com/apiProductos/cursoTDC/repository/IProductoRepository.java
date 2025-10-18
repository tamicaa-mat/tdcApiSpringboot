package com.apiProductos.cursoTDC.repository;

import com.apiProductos.cursoTDC.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// no debemos tener clase que implemente esta interfaz ya que usamos jpa

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long> {



}
