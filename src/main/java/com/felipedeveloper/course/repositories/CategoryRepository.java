package com.felipedeveloper.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipedeveloper.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
