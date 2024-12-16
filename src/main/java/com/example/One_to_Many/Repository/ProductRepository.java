package com.example.One_to_Many.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.One_to_Many.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
