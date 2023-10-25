package com.example.API.REST;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.servicio.ProductoServicio;
import main.entidad.Producto;

@RestController
@RequestMapping("/producto")
public class ProductoControlador {
    
@Autowired
ProductoServicio productoservcio;

@PostMapping("/cargarproducto")
public Producto cargaProducto(@RequestBody Producto producto)
{
    return this.productoservcio.cargarProducto(producto);
}

@GetMapping("/articulos")
public ArrayList<Producto> obtenerProductos()
{
    return productoservcio.obtenProductos();
}

@GetMapping(path = "/buscar_{id}")
public optional<Producto> buscarPorid(@PathVariable("id") long id)
{
    return this.productoservcio.buscarPorid(id);
}

@PutMapping("/modificar_{id}")
public Producto modificaProducto(@RequestBody Producto productoAmodificar, @PathVariable("id") long id)
{
    return this.productoservcio.modificarProducto(productoAmodificar, id);
}

@DeleteMapping(path = "/eliminar_{id}")
public String eliminaProducto(@PathVariable("id") long id)
{
    boolean eliminacion = productoservcio.eliminarProducto(id);

    if(eliminacion)
    {
        return "producto eliminado";
    }
    else
    {
        return "no fue posible realizar la accion";
    }
}

@GetMapping("/venta")
public void venta()
{
    Producto prd; 
    prd.mostrarAcliente();
}

}
