package com.brunocruz.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunocruz.estudos.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
