package com.example.demo.order;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Orders> getOrders() {
        return orderRepository.findAll();
    }
    public Optional<Orders> getOrder(Long orderId) {
        return orderRepository.findById(orderId);
    }
    public void saveOrder(Orders order) {
        orderRepository.save(order);
        System.out.println("@@@@@@@@@@@@@@@@@@ "+ order.toString());
    }

}
