package com.example.demo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Orders> getOrders() {
        return orderService.getOrders();
    }

    @GetMapping(path = "{orderId}")
    public Optional<Orders> getOrder(@PathVariable("orderId") Long orderId) {
        return orderService.getOrder(orderId);
    }

    @PostMapping
    public void saveOrder(@RequestBody Orders order) {
        orderService.saveOrder(order);
    }
}
