package com.arqapp.sistemaventas.producto.appplication;

import com.arqapp.sistemaventas.producto.domain.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ProductosRepository extends CrudRepository<Producto, Integer> {

    Producto findFirstByCodigo(String codigo);
}
