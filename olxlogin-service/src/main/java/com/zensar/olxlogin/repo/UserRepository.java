package com.zensar.olxlogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.olxlogin.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
