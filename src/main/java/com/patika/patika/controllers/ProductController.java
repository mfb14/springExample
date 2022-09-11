package com.patika.patika.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patika.patika.business.abstracts.ProductService;
import com.patika.patika.entities.Product;
import com.patika.patika.entities.ProductComment;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	@GetMapping("/gE")
	public List<Product> getExpiredProducts(){
		return productService.getExpiredProducts();
	}
	@GetMapping("/ge")
	public List<Product> getNotExpiredProducts(){
		return productService.getNotExpiredProducts();
	}
	
}
