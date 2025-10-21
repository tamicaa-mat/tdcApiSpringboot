package com.apiProductos.cursoTDC.repository;

import com.apiProductos.cursoTDC.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository <Cliente, Long> {



}
