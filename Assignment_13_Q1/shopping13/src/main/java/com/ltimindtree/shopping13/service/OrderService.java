package com.ltimindtree.shopping13.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltimindtree.shopping13.entity.Order;
import com.ltimindtree.shopping13.repository.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrderById(Long orderId){
        return orderRepository.findById(orderId).orElse(null);
    }

    public Order addOrder(Order order){
        return orderRepository.save(order);
    }
}
