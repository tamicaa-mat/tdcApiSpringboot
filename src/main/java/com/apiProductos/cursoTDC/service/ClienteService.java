package com.apiProductos.cursoTDC.service;


import com.apiProductos.cursoTDC.dto.ClienteDto;

import com.apiProductos.cursoTDC.model.Cliente;

import com.apiProductos.cursoTDC.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepo;

    @Override
    public List<ClienteDto> getClientes() {
        List<Cliente> clientes = clienteRepo.findAll();
        List<ClienteDto> clientesDto = new ArrayList<>();

        // agarro los clientes que vienen de la BD las convierto a dto antes de volver como respuesta
        for (Cliente cliente : clientes) {
            clientesDto.add(convertirADto(cliente));
        }
        return clientesDto;
    }



    @Override
    public Cliente saveCliente(ClienteDto dto) {
        Cliente cliente = new Cliente();
        cliente.setNombre(dto.getNombre());
        cliente.setApellido(dto.getApellido());
        cliente.setDni(dto.getDni());
        cliente.setDireccion(dto.getDireccion());
        cliente.setTelefono(dto.getTelefono());
        cliente.setEmail(dto.getEmail());
        return clienteRepo.save(cliente);


    }



    @Override
    public void deleteCliente(Long codigo) {
       clienteRepo.deleteById(codigo);
    }

    ///  agrego funcion para convertir a DTO
    private ClienteDto convertirADto(Cliente cliente) {
        ClienteDto dto = new ClienteDto();
        dto.setNombre(cliente.getNombre());
        dto.setApellido(cliente.getApellido());
        dto.setDni(cliente.getDni());
        dto.setDireccion(cliente.getDireccion());
        dto.setTelefono(cliente.getTelefono());
        dto.setEmail(cliente.getEmail());
        return dto;
    }

}
