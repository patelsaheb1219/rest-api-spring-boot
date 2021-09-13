package com.sample.restapis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.restapis.dtos.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<User, Integer> {

}