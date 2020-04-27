package com.felipedeveloper.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipedeveloper.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
