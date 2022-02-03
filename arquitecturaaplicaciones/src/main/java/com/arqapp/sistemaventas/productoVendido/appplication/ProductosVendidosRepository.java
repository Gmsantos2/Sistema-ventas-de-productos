package com.arqapp.sistemaventas.productoVendido.appplication;

import com.arqapp.sistemaventas.productoVendido.domain.ProductoVendido;
import org.springframework.data.repository.CrudRepository;

public interface ProductosVendidosRepository extends CrudRepository<ProductoVendido, Integer> {

}
