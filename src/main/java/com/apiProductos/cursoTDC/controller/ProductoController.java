package com.apiProductos.cursoTDC.controller;

import com.apiProductos.cursoTDC.model.Producto;
import com.apiProductos.cursoTDC.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//agrego @RequestMapping en todos los controladores
//en el controlador SIEMPRE ES RESPONSEENTITY , NUESTRO SECRVICIO ESTA BIEN ya que esa capa maneja datos internos, no endpoints,
// PERO EN LOS CONTROLADORES SIEMPRE RESPONSEENTITY para manejar codigos de estado y http,

@RestController
@RequestMapping("/producto")
public class ProductoController {


    //inyeccion dependencia del service /negocio
    @Autowired
    ProductoService productoService;

    //ResponseEntity
    @GetMapping("/productos")
    public ResponseEntity<?> getProductos(){
        return ResponseEntity.ok(productoService.getProductos());

    }

    //ResponseEntity
    @PostMapping("/productos/crear")
    public ResponseEntity<?> crearProducto(Producto p){
        return ResponseEntity.ok(productoService.saveProducto(p));

    }


    //ResponseEntity
    @DeleteMapping("/productos/eliminar/{codigo_producto}")
    public ResponseEntity<?> deleteProducto(@PathVariable Long codigo_producto){
        productoService.deleteProducto(codigo_producto);
        return ResponseEntity.ok("Producto eliminado correctamente");

    }






}
