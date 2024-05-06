package com.brunocruz.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunocruz.estudos.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
