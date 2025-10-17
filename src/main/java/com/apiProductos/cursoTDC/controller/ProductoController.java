package com.apiProductos.cursoTDC.controller;

import com.apiProductos.cursoTDC.model.Producto;
import com.apiProductos.cursoTDC.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/producto")
public class ProductoController {

    //inyeccion dependencia del service /negocio
    @Autowired
    ProductoService productoService;

    @GetMapping("/productos")
    public List<Producto> getProductos(){
        return productoService.getProductos();
    }


}
