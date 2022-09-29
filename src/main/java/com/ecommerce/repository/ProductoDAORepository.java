package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Producto;

@Repository
public interface ProductoDAORepository extends JpaRepository <Producto, Integer> {

}
