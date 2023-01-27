package com.sarva.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarva.customer.model.Product;
import com.sarva.customer.repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;

	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		double total=product.getPrice()*product.getQuantity();
		double discount;
		if(total<2500)
			discount=0.1*total;
		else if(total>=2500)
			discount=0.15*total;
		else
			discount=0.3*total;
		double gst=total*0.02857142857;
		product.setTotal(total);
		product.setDiscount(discount);
		product.setGst_amt(gst);
		product.setInvoice_bill(total-discount+gst);
		return repo.save(product);
		
	}

	public Product get(Integer id) {
		return repo.findById(id).get();
	}

	public void  deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		
		repo.deleteById(id);
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	

}
