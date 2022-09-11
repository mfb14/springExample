package com.patika.patika.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "products")
public class Product {

		@Id
		private Long id;
		
		@Column(name = "name",length = 50,nullable = false)
		private String name;
		
		@Column(name = "cost",nullable = false)
		private BigDecimal cost;
		
		@Column(name = "expiration_date",nullable = false)
		@DateTimeFormat(pattern = "dd-MM-yyyy")
		private Date expirationDate;

		public Product() {}

		public Product(Long id, String name, BigDecimal cost, Date expirationDate) {
			super();
			this.id = id;
			this.name = name;
			this.cost = cost;
			this.expirationDate = expirationDate;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public BigDecimal getCost() {
			return cost;
		}

		public void setCost(BigDecimal cost) {
			this.cost = cost;
		}

		public Date getExpirationDate() {
			return expirationDate;
		}

		public void setExpirationDate(Date expirationDate) {
			this.expirationDate = expirationDate;
		}
		
}


