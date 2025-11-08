package com.apiProductos.cursoTDC.service;

import com.apiProductos.cursoTDC.dto.ClienteDto;
import com.apiProductos.cursoTDC.model.Cliente;

import java.util.List;

public interface IClienteService {



  //  Cliente findById(Long id);

    List<ClienteDto> getClientes();

    Cliente saveCliente(ClienteDto dto);

    void deleteCliente(Long id);

}
