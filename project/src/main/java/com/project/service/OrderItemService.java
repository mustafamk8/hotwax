package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.OrderItem;
import com.project.repo.OrderItemRepo;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {
    private final OrderItemRepo orderItemRepository;

    @Autowired
    public OrderItemService(OrderItemRepo orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    public Optional<OrderItem> getOrderItemById(String orderItemId) {
        return orderItemRepository.findById(orderItemId);
    }

    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public OrderItem updateOrderItem(String orderItemId, OrderItem updatedOrderItem) {
        if (orderItemRepository.existsById(orderItemId)) {
            updatedOrderItem.setOrderItemSeqId(orderItemId);
            return orderItemRepository.save(updatedOrderItem);
        }
        return null; // Handle not found scenario as needed
    }

    public void deleteOrderItem(String orderItemId) {
        orderItemRepository.deleteById(orderItemId);
    }
}
