package com.example.API.REST;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.Table;
import main.entidad.Producto;

@Service
public class ProductoServicio implements Producto{
@Autowired
ProductoRepositorio productorepositorio;

public Producto cargarProducto(Producto producto)
{
    return productorepositorio.save(producto);
}

public ArrayList<Producto> obtenerProductos()
{
    return(ArrayList<Productods>) productorepositorio.findAll();
}
   
public Optional<Producto> buscarPorID(long id)
{
    return productorepositorio.findById(id);
}
    
public Producto modificarProducto(Producto productoAmodificar, long id)
{
    Producto prdaux = ProductoRepositorio.findById(id).get();

    prdaux.setNombre(productoAmodificar.getNombre());
    prdaux.setPrecio(productoAmodificar.getPrecio());
    prdaux.setStock(productoAmodificar.getStock());

    return productorepositorio.save(prdaux);
}

public boolean eliminarProducto(long id)
{
    try {
        productorepositorio.deleteById(id);
        return true;
    } catch (Exception e) {
        return false;
    }
}

public  void mostrarAcliente()
{
    ArrayList<Producto> productos = new ArrayList<>(null);

    for(int i = 0; i < productos.size(); i++)
    {
        Producto aux = productos.get(i);
        System.out.println(aux.getNombre + "\n" + (aux.getPrecio += aux.getPrecio / 2) + "\n" + aux.getStock);
    }
}
    
}
