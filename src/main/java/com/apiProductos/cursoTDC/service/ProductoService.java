package com.apiProductos.cursoTDC.service;

import com.apiProductos.cursoTDC.model.Producto;
import com.apiProductos.cursoTDC.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{

    //inyeccion de dependencia el repositorio
    @Autowired
    private IProductoRepository productoRepo ;

    @Override
    public List<Producto> getProductos() {
        List<Producto> listaProductos = productoRepo.findAll();

        return listaProductos;
    }


}
