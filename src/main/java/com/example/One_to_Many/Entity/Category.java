package com.example.One_to_Many.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "category")
public class Category {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="category") 

	private List<Product> product;
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public List<Product> getProduct() {
	return product;
	}
	public void setProduct(List<Product> product) {
	this.product = product;
	}

}
