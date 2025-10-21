package com.apiProductos.cursoTDC.service;


import com.apiProductos.cursoTDC.model.Cliente;
import com.apiProductos.cursoTDC.model.Producto;
import com.apiProductos.cursoTDC.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepo;



    @Override
    public List<Cliente> getClientes() {
        List<Cliente> listaClientes = clienteRepo.findAll();

        return listaClientes;
    }

    @Override
    public void saveCliente(Cliente c) {
        clienteRepo.save(c);

    }

    @Override
    public void deleteCliente(Long codigoCliente) {
       clienteRepo.deleteById(codigoCliente);
    }

    @Override
    public Cliente findById(Long id) {
        Cliente c;
        c=clienteRepo.findById(id).orElse(null);
        return c;

    }

    @Override
    public void editCliente(Long idOriginal, Long idNueva, String nombre, String apellido, String dni) {

    }
}
