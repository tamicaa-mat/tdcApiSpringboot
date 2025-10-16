package com.apiProductos.cursoTDC.Controller;

import com.apiProductos.cursoTDC.Service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

    @Autowired
    IProductoService productoService;

}
