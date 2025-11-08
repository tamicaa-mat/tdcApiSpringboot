package com.apiProductos.cursoTDC.service;

import com.apiProductos.cursoTDC.dto.ProductoDto;
import com.apiProductos.cursoTDC.model.Producto;
import com.apiProductos.cursoTDC.model.Venta;
import com.apiProductos.cursoTDC.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService implements IProductoService{

    //inyeccion de dependencia el repositorio
    @Autowired
    private IProductoRepository productoRepository;

//    @Override
//    public List<Producto> getProductos() {
//        return  productoRepository.findAll();
//    }

    @Override
    public List<ProductoDto> getProductos() {
        List<Producto> productos = productoRepository.findAll();
        List<ProductoDto> productosDto = new ArrayList<>();

        // agarro los productos que vienen de la BD las convierto a dto antes de volver como respuesta
        for (Producto producto : productos) {
            productosDto.add(convertirADto(producto));
        }
        return productosDto;
    }

    @Override
    public Producto saveProducto(ProductoDto dto) {
        Producto producto = new Producto();
        producto.setNombre(dto.getNombre());
        producto.setMarca(dto.getMarca());
        producto.setCosto(dto.getCosto());
        producto.setCantidad(dto.getCantidad());

        return productoRepository.save(producto);

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


    ///  agrego funcion para convertir a DTO
    private ProductoDto convertirADto(Producto producto) {
        ProductoDto dto = new ProductoDto();
        dto.setCodigo_producto(producto.getCodigo_producto());
        dto.setNombre(producto.getNombre());
        dto.setMarca(producto.getMarca());
        dto.setCosto(producto.getCosto());
        dto.setCantidad(producto.getCantidad());
        return dto;
    }
}
