package com.apiProductos.cursoTDC.controller;

import com.apiProductos.cursoTDC.dto.ProductoDto;
import com.apiProductos.cursoTDC.dto.VentaDto;
import com.apiProductos.cursoTDC.model.Producto;
import com.apiProductos.cursoTDC.model.Venta;
import com.apiProductos.cursoTDC.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    VentaService ventaService;

    //ResponseEntity
    @GetMapping()
    public ResponseEntity<?> getVentas(){
        return ResponseEntity.ok(ventaService.getVentas());

    }

    //ResponseEntity

    @PostMapping("/crear")
    public ResponseEntity<Venta> saveVenta(@RequestBody VentaDto dto) {
        Venta guardado = ventaService.saveVenta(dto);
        return ResponseEntity.ok(guardado);
    }


    //ResponseEntity
    @DeleteMapping("/eliminar/{codigo_venta}")
    public ResponseEntity<?> deleteVenta(@PathVariable Long codigo_venta){
        ventaService.deleteVenta(codigo_venta);
        return ResponseEntity.ok("Producto eliminado correctamente");

    }



}
