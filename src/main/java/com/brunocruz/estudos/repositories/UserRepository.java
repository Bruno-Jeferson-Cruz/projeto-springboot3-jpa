package com.brunocruz.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunocruz.estudos.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
