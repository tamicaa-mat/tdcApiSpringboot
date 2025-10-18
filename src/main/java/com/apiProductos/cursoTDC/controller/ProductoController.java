package com.apiProductos.cursoTDC.controller;

import com.apiProductos.cursoTDC.model.Producto;
import com.apiProductos.cursoTDC.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping("/productos/crear")
    public String  crearProducto(Producto p){
        productoService.saveProducto(p);
        return "el producto se creo con exito";
        }

    @DeleteMapping("/productos/eliminar/{codigo_producto}")
    public String deleteProducto(@PathVariable Long codigo_producto){
        productoService.deleteProducto(codigo_producto);
        return  "producto eliminado";
    }






}
