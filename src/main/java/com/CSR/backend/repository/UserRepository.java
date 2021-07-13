package com.CSR.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CSR.backend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
