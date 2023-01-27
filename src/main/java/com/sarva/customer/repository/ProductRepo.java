package com.sarva.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarva.customer.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{
	

}
