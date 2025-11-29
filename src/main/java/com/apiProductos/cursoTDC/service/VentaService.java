package com.apiProductos.cursoTDC.service;

import com.apiProductos.cursoTDC.dto.ClienteDto;
import com.apiProductos.cursoTDC.dto.ProductoDto;
import com.apiProductos.cursoTDC.dto.VentaDto;
import com.apiProductos.cursoTDC.model.Cliente;
import com.apiProductos.cursoTDC.model.Producto;
import com.apiProductos.cursoTDC.model.Venta;

import com.apiProductos.cursoTDC.repository.IClienteRepository;
import com.apiProductos.cursoTDC.repository.IProductoRepository;
import com.apiProductos.cursoTDC.repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VentaService implements IVentaService{

    @Autowired
    private IVentaRepository ventaRepository ;
    @Autowired
    private IClienteRepository clienteRepository;
    @Autowired
    private IProductoRepository productoRepository;
    /// /////////////////

    public List<VentaDto> getVentas() {
        List<Venta> ventas = ventaRepository.findAll();
        List<VentaDto> ventasDto = new ArrayList<>();

        // agarro las ventas que vienen de la BD las convierto a dto antes de devolver como respuesta
        for (Venta venta : ventas) {
            ventasDto.add(convertirADto(venta));
        }
        return ventasDto;
    }


    @Override
    public Venta saveVenta(VentaDto dto) {

        Venta venta = new Venta();

        // seteo de atributos de venta ojo venta tiene cliente y tiene productos
        venta.setFecha_venta(dto.getFechaVenta());
        venta.setTotal(dto.getTotal());


        // SETEAR CLIENTE

        Cliente cliente = clienteRepository.findById(dto.getCliente().getCodigo_cliente())
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        venta.setCliente(cliente);

        // 2) SETEAR PRODUCTOS

        List<Producto> productos = new ArrayList<>();

        for (ProductoDto pDto : dto.getProductos()) {

            Producto p = productoRepository.findById(pDto.getCodigo_producto())
                    .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

            p.setOrden(venta);  // clave: asignar la venta al producto
            productos.add(p);
        }

        venta.setListaProductos(productos);

        // 3) GUARDAR VENTA
        Venta ventaGuardada = ventaRepository.save(venta);

        return ventaGuardada;
    }



    @Override
    public void deleteVenta(Long codigoVenta) {
        ventaRepository.deleteById(codigoVenta);
    }

    @Override
    public Venta findById(Long codigoVenta) {
        return ventaRepository.findById(codigoVenta).orElse(null);
    }





    ///  agrego funcion para convertir a DTO
    private VentaDto convertirADto(Venta venta) {
        VentaDto dto = new VentaDto();
        dto.setCodigoVenta(venta.getCodigo_venta());
        dto.setFechaVenta(venta.getFecha_venta());
        dto.setTotal(venta.getTotal());
       // para setear la lista de productos de la venta en el ventadto
        List<ProductoDto> productosDto = venta.getListaProductos()
                .stream()
                .map(p -> {
                    ProductoDto pDto = new ProductoDto();
                    pDto.setCodigo_producto(p.getCodigo_producto());
                    pDto.setNombre(p.getNombre());
                    pDto.setCosto(p.getCosto());

                    return pDto;
                })
                .toList();

        dto.setProductos(productosDto);

        Cliente cliente = venta.getCliente();

        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setCodigo_cliente(cliente.getCodigo_cliente());
        clienteDto.setNombre(cliente.getNombre());
        clienteDto.setApellido(cliente.getApellido());
        clienteDto.setDni(cliente.getDni());
        clienteDto.setEmail(cliente.getEmail());
        clienteDto.setTelefono(cliente.getTelefono());
        clienteDto.setDireccion(cliente.getDireccion());

        dto.setCliente(clienteDto);




        return dto;
    }


}
