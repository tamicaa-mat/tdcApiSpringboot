package com.apiProductos.cursoTDC.controller;

import com.apiProductos.cursoTDC.dto.ClienteDto;

import com.apiProductos.cursoTDC.model.Cliente;

import com.apiProductos.cursoTDC.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController{

    //inyeccion dependencia del service /negocio
    @Autowired
    ClienteService clienteService;

    //ResponseEntity
    @GetMapping()
    public ResponseEntity<?> getClientes(){
        return ResponseEntity.ok(clienteService.getClientes());

    }

    //ResponseEntity aca en lugar de crear un producto a la vez, mejor creamos un lista de prodctos

    @PostMapping("/crear")
    public ResponseEntity<Cliente> saveCliente(@RequestBody ClienteDto dto) {
        Cliente guardado = clienteService.saveCliente(dto);
        return ResponseEntity.ok(guardado);
    }


    //ResponseEntity
    @DeleteMapping("/eliminar/{codigo_cliente}")
    public ResponseEntity<?> deleteCliente(@PathVariable Long codigo_cliente){
        clienteService.deleteCliente(codigo_cliente);
        return ResponseEntity.ok("Producto eliminado correctamente");

    }




}