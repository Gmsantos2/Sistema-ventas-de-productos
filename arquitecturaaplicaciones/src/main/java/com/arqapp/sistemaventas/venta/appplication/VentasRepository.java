package com.arqapp.sistemaventas.venta.appplication;

import com.arqapp.sistemaventas.venta.domain.Venta;
import org.springframework.data.repository.CrudRepository;

public interface VentasRepository extends CrudRepository<Venta, Integer> {
}
