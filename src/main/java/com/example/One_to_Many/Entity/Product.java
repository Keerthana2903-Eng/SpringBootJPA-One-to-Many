package com.example.One_to_Many.Entity;

import java.util.Locale.Category;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore

	private com.example.One_to_Many.Entity.Category category;
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
	public com.example.One_to_Many.Entity.Category getCategory() {
	return category;
	}
	public void setCategory(com.example.One_to_Many.Entity.Category ce) {
	this.category = ce;
	}
	
}
