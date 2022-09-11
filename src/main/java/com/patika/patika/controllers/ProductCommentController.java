package com.patika.patika.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patika.patika.business.abstracts.ProductCommentService;
import com.patika.patika.entities.ProductComment;

@RestController
@RequestMapping("/comments")
public class ProductCommentController {

	ProductCommentService productCommentService;
	public ProductCommentController(ProductCommentService productCommentService) {
		this.productCommentService=productCommentService;
	}
	
	@GetMapping()
	public List<ProductComment> getAllComments(@RequestParam("userId") Optional<Long> userId, @RequestParam("productId") Optional<Long> productId){
		return productCommentService.getAllComments(userId, productId);
	}
	

	@GetMapping("/{productCommentId}")
	public ProductComment getOneProductComment(@PathVariable Long productCommentId ){
		return productCommentService.getOneProductComment(productCommentId);
	}
	
	@GetMapping("/date/{productId}")
	public List<ProductComment> getProductCommentByProductIdBetweenDate(@RequestParam Long productId,@RequestParam @DateTimeFormat(pattern = "dd-MM-yyyy") Date startDate , @RequestParam @DateTimeFormat(pattern = "dd-MM-yyyy") Date endDate)
	{
		return productCommentService.getProductCommentByProductIdBetweenDate(productId,startDate,endDate);
		
	}
	
	
}