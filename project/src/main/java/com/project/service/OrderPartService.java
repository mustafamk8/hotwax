package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.OrderPart;
import com.project.repo.OrderPartRepo;

import java.util.List;
import java.util.Optional;

@Service
public class OrderPartService {

    private final OrderPartRepo orderPartRepository;

    @Autowired
    public OrderPartService(OrderPartRepo orderPartRepository) {
        this.orderPartRepository = orderPartRepository;
    }

 
    public OrderPart createOrderPart(OrderPart orderPart) {
        return orderPartRepository.save(orderPart);
    }

    
}

