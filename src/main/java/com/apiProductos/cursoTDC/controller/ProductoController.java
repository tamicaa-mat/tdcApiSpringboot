package com.apiProductos.cursoTDC.controller;

import com.apiProductos.cursoTDC.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/producto")
public class ProductoController {

    @Autowired
    ProductoService productoService;

}
