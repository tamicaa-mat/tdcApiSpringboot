package com.apiProductos.cursoTDC.repository;

import com.apiProductos.cursoTDC.model.Producto;


import java.util.List;

public interface IProductoRepository {

 List<Producto> findAll();

}
