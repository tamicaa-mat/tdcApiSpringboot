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
    private IProductoRepository productoRepository;

    @Override
    public List<Producto> getProductos() {
        return  productoRepository.findAll();
    }

    @Override
    public Producto saveProducto(Producto p) {
       return productoRepository.save(p);
    }

    @Override
    public void deleteProducto(Long codigo_p) {
       productoRepository.deleteById(codigo_p);
    }

    @Override
    public Producto findProducto(Long codigo_p) {
        return productoRepository.findById(codigo_p).orElse(null);
    }

    @Override
    public void editProducto(Long idOriginal, Long idNueva, String nombreNuevo, String descripcionNueva, double precioNuevo) {
        // vemos despues

    }


}
