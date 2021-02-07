package com.icnmicros.app.producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icnmicros.app.commons.models.entity.Producto;

public interface ProductoDao extends JpaRepository<Producto, Long>{

}
