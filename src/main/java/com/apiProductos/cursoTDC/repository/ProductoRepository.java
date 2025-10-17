package com.apiProductos.cursoTDC.repository;

import com.apiProductos.cursoTDC.model.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductoRepository implements  IProductoRepository {

    private static List<Producto> productos = new ArrayList<>();

    static {
        // simulamos  productos guardados en la BD
        productos.add(new Producto(1L, "C001", "Zapatillas Nike", 35222.06, 36));
        productos.add(new Producto(2L, "C002", "Campera Adidas", 556.325, 40));
        productos.add(new Producto(3L, "C003", "Remera Puma", 22558.3, 10));
    }


    @Override
    public List<Producto> findAll() {
        return new ArrayList<Producto>(productos);
    }
















}
