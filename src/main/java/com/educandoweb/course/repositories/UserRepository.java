package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entitites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
