package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.OrderItem;

public interface OrderItemRepo extends JpaRepository<OrderItem, String>{

}
