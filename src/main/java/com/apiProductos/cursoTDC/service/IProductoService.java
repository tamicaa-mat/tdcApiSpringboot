package com.apiProductos.cursoTDC.service;

import com.apiProductos.cursoTDC.dto.ProductoDto;
import com.apiProductos.cursoTDC.model.Producto;

import java.util.List;

public interface IProductoService {

    List<Producto> getProductos();

   Producto saveProducto(ProductoDto dto);

   void deleteProducto(Long codigoProducto);


   Producto findProducto(Long id);

    //falta el metodo modificacion de producto
    void editProducto(Long idOriginal, Long idNueva, String nombreNuevo, String descripcionNueva, double precioNuevo);






}

