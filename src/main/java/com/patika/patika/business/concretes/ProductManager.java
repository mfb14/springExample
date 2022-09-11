package com.patika.patika.business.concretes;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patika.patika.business.abstracts.ProductService;
import com.patika.patika.dataAccess.ProductDao;
import com.patika.patika.entities.Product;

@Service
public class ProductManager implements ProductService {

	@Autowired
	ProductDao productDao;
	@Override
	public List<Product> getAllProducts() {
		return productDao.findAll();
	}
	@Override
	public List<Product> getExpiredProducts() {
		
		Calendar cal = Calendar.getInstance();
		java.util.Date date = cal.getTime();
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String formattedDate=df.format(date);
		java.sql.Date sdate = java.sql.Date.valueOf(formattedDate);

		return productDao.findAllExpiredProducts(sdate);

	}
	@Override
	public List<Product> getNotExpiredProducts() {
		
		Calendar cal = Calendar.getInstance();
		java.util.Date date = cal.getTime();
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String formattedDate=df.format(date);
		java.sql.Date sdate = java.sql.Date.valueOf(formattedDate);
		
		return productDao.findAllNotExpiredProducts(sdate);
	}

	
}
