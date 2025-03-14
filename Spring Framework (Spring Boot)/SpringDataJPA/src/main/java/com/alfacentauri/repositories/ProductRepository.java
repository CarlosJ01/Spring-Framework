package com.alfacentauri.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.alfacentauri.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	List<Product> findByName(String name);
	
	List<Product> findByNameAndPrice(String name, Double price);
	
}