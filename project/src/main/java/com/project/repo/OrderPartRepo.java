package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.OrderPart;

public interface OrderPartRepo extends JpaRepository<OrderPart, String>{

}
