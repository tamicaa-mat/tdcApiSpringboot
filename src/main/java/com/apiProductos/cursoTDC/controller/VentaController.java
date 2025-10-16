package com.apiProductos.cursoTDC.controller;

import com.apiProductos.cursoTDC.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/venta")
public class VentaController {

    @Autowired
    VentaService ventaService;

}
