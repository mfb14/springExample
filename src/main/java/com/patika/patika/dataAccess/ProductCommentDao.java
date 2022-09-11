package com.patika.patika.dataAccess;


import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patika.patika.entities.ProductComment;


@Repository
public interface ProductCommentDao extends JpaRepository<ProductComment, Long>{

	//@Query(value = "select t from ProductComment t where t.users.id = :userId")
	

	List<ProductComment> findAllByUserIdAndProductId(Optional<Long> userId, Optional<Long> productId);
	List<ProductComment> findAllByUserIdAndProductId(Long userId, Long productId);

	List<ProductComment> findByUserId(Optional<Long> userId);

	List<ProductComment> findByProductId(Optional<Long> productId);
	List<ProductComment> findAllByProductIdBetween(Long productId, Date startDate, Date endDate);

	

	

}
