package com.example.One_to_Many.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.One_to_Many.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
