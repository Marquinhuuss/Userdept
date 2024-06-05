package com.project.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
