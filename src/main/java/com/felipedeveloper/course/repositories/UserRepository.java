package com.felipedeveloper.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipedeveloper.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
