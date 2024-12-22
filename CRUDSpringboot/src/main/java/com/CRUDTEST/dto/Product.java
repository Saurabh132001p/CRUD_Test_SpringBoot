package com.CRUDTEST.dto;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String pro_name;
	int pro_quantity;
	double pro_price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "c_id")
	Category category;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int id, String pro_name, int pro_quantity, double pro_price, Category category) {
		super();
		this.id = id;
		this.pro_name = pro_name;
		this.pro_quantity = pro_quantity;
		this.pro_price = pro_price;
		this.category = category;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPro_name() {
		return pro_name;
	}


	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}


	public int getPro_quantity() {
		return pro_quantity;
	}


	public void setPro_quantity(int pro_quantity) {
		this.pro_quantity = pro_quantity;
	}


	public double getPro_price() {
		return pro_price;
	}


	public void setPro_price(double pro_price) {
		this.pro_price = pro_price;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", pro_name=" + pro_name + ", pro_quantity=" + pro_quantity + ", pro_price="
				+ pro_price + ", category=" + category + "]";
	}

}
