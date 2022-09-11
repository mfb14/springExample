package com.patika.patika.business.abstracts;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import com.patika.patika.entities.ProductComment;

public interface ProductCommentService {

	
	
	public List<ProductComment> getCommentBetweenTwoDateByProductId( Optional<Long> productId, Date fromDate, Date toDate);

	public List<ProductComment> getAllComments(Optional<Long> userId, Optional<Long> productId);


	public ProductComment getOneProductComment(Long productCommentId);
	
	public List<ProductComment> findAllProductComments();

	public List<ProductComment> getProductCommentByProductIdBetweenDate(Long productId, Date startDate, Date endDate);

	
}
