package com.project.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.project.model.OrderPart;
import com.project.service.OrderPartService;



@RestController
@RequestMapping("/api/orderparts")
public class OrderPartController {

    private final OrderPartService orderPartService;

    @Autowired
    public OrderPartController(OrderPartService orderPartService) {
        this.orderPartService = orderPartService;
    }

    @PostMapping("/create")
    public ResponseEntity<OrderPart> createOrderPart(@RequestBody OrderPart orderPart) {
        OrderPart createdOrderPart = orderPartService.createOrderPart(orderPart);
        return new ResponseEntity<>(createdOrderPart, HttpStatus.CREATED);
    }

    
}
