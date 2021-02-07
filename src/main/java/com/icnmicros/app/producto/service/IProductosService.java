package com.icnmicros.app.producto.service;

import java.util.List;

import com.icnmicros.app.commons.models.entity.Producto;

public interface IProductosService {

	public List<Producto> findAll();

	public Producto findById(Long id);

	public Producto save(Producto producto);

	public void deleteById(Long id);
}
