package com.patika.patika.entities;

import java.sql.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"user","product"})
@Entity
@Table(name="product_comments")
public class ProductComment {
	
	@Id
	private Long id;
	
	
	@Column(columnDefinition = "text",name = "comments",length = 500)
	private String comment;
	
	@Column(name = "comment_date")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date commentDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id",nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id",nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Product product;

	public ProductComment(Long id, String comment, Date commentDate, User user, Product product) {
		
		this.id = id;
		this.comment = comment;
		this.commentDate = commentDate;
		this.user = user;
		this.product = product;
	}

	public ProductComment() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
}
