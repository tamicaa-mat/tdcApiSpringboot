package com.apiProductos.cursoTDC.service;

import com.apiProductos.cursoTDC.model.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> getClientes();

    void saveCliente(Cliente c);

    void deleteCliente(Long codigoCliente);


    Cliente findById(Long id);

    //falta el metodo modificacion de producto
    void editCliente(Long idOriginal, Long idNueva, String nombre, String apellido, String dni);




}
