package com.patika.patika.business.concretes;


import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import java.util.Date;
import com.patika.patika.business.abstracts.ProductCommentService;
import com.patika.patika.dataAccess.ProductCommentDao;
import com.patika.patika.entities.ProductComment;

@Service
public class ProductCommentManager implements ProductCommentService{

	

	ProductCommentDao productCommentDao;
	
	

	public ProductCommentManager(ProductCommentDao productCommentDao) {
		this.productCommentDao = productCommentDao;
	
	}
	public ProductCommentManager() {}

	//@Override
	/*
	 * public List<ProductComment> getCommentBetweenTwoDateByProductId(
	 * Optional<Long> productId, Date fromDate, Date toDate){
	 * 
	 * List<ProductComment> pc = (List<ProductComment>) new ProductComment(); if
	 * (productId.isPresent()) { pc =
	 * productCommentDao.findAllByProductId(productId.get()); for (ProductComment
	 * productComment : pc) { if
	 * (productComment.getCommentDate().after(fromDate)&&productComment.
	 * getCommentDate().before(toDate)) {
	 * 
	 * 
	 * } }
	 * 
	 * } return null;
	 */
		


	@Override
	public List<ProductComment> getCommentBetweenTwoDateByProductId(Optional<Long> productId, Date fromDate,
			Date toDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductComment> getAllComments(Optional<Long> userId, Optional<Long> productId) {
		if (userId.isPresent()&&productId.isPresent()) {
			return productCommentDao.findAllByUserIdAndProductId(userId, productId);
		} else if(userId.isPresent()){
			return productCommentDao.findByUserId(userId);
		}else if (productId.isPresent()) {
			return productCommentDao.findByProductId(productId);
		}
		else {
			return null;
		}
	}
	
	

	@Override
	public ProductComment getOneProductComment(Long productCommentId) {
		
		return productCommentDao.findById(productCommentId).orElse(null);
	}

	@Override
	public List<ProductComment> findAllProductComments() {
		return productCommentDao.findAll();
	}
	@Override
	public List<ProductComment> getProductCommentByProductIdBetweenDate(Long productId, Date startDate, Date endDate) {
		return productCommentDao.findAllByProductIdBetween(productId,startDate,endDate);
	}


}
