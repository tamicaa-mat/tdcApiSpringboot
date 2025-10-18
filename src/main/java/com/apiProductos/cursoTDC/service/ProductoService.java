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

    @Override
    public void saveProducto(Producto p) {
        productoRepo.save(p);

    }

    @Override
    public void deleteProducto(Long codigo_p) {
        productoRepo.deleteById(codigo_p);
    }

    @Override
    public Producto findProducto(Long codigo_p) {
        Producto prod;
        prod=productoRepo.findById(codigo_p).orElse(null);
        return prod;

    }

    @Override
    public void editProducto(Long idOriginal, Long idNueva, String nombreNuevo, String descripcionNueva, double precioNuevo) {
        // vemos despues

    }


}
