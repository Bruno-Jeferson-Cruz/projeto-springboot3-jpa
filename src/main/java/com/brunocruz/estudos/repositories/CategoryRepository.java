package com.brunocruz.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunocruz.estudos.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
