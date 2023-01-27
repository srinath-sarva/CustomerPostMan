package com.sarva.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sarva.customer.model.Product;
import com.sarva.customer.service.ProductService;

@RestController
public class CustomerController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody  Product product)
	{
		
		return service.saveProduct(product);
	}
	
	@GetMapping("/get/{id}")
	public Product getProduct(@PathVariable Integer id)
	{
		return service.get(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable Integer id)
	{
		 service.deleteProduct(id);
	}
	@GetMapping("/getAll")
	public List<Product> getAll()
	{
		return service.getAll();
	}
	@PostMapping("/update/{id}")
	public Product updateEmployee(@RequestBody Product product)
	{
		return service.saveProduct(product);
	}
	
}
