package com.example.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudapp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
