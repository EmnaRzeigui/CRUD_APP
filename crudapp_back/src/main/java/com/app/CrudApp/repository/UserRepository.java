package com.app.CrudApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.CrudApp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}