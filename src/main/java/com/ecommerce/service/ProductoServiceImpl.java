package com.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Producto;
import com.ecommerce.repository.ProductoDAORepository;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoDAORepository productoDAORepository;
	
	@Override
	public Producto save(Producto producto) {
		return productoDAORepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		return productoDAORepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		 productoDAORepository.save(producto);
	}

	@Override
	public void delete(Integer id) {
		productoDAORepository.deleteById(id);
	}

}
