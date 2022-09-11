package com.patika.patika.dataAccess;



import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.patika.patika.entities.Product;


public interface ProductDao extends JpaRepository<Product, Long>{

	List<Product> findAll();

	@Query(value = "SELECT p FROM products p WHERE p.products.expiration_date =p.products.expiration_date < :date", nativeQuery = true)
	List<Product> findAllExpiredProducts(@Param("date") Date date);
	
	@Query(value = "SELECT p FROM products p WHERE p.products.expiration_date =p.products.expiration_date > :date", nativeQuery = true)
	List<Product> findAllNotExpiredProducts(@Param("date") Date date);

}
