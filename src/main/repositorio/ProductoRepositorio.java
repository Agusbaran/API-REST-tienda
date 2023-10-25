package com.example.API.REST;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends CrudRepository<Producto, Long> {
    
}
