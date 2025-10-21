package com.apiProductos.cursoTDC.service;

import com.apiProductos.cursoTDC.model.Venta;

import com.apiProductos.cursoTDC.repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class VentaService implements IVentaService{

    @Autowired
    private IVentaRepository ventaRepo ;


    @Override
    public List<Venta> getVentas() {
        List<Venta> listaVentas = ventaRepo.findAll();

        return listaVentas;
    }

    @Override
    public void saveVenta(Venta v) {
        ventaRepo.save(v);
    }

    @Override
    public void deleteVenta(Long codigoVenta) {
        ventaRepo.deleteById(codigoVenta);
    }

    @Override
    public Venta findById(Long id) {
        Venta v;
        v=ventaRepo.findById(id).orElse(null);
        return v;
    }

    @Override
    public void editVenta(Long codigo, Long codigoNuevo, LocalDate fecha, Double total, List<Venta> ventas) {

    }
}
