package com.patika.patika.business.abstracts;

import java.util.List;

import com.patika.patika.entities.Product;

public interface ProductService {

	List<Product> getAllProducts();

	List<Product> getExpiredProducts();

	List<Product> getNotExpiredProducts();



	
}
