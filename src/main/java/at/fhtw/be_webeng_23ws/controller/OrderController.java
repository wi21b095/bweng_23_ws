package at.fhtw.be_webeng_23ws.controller;

import at.fhtw.be_webeng_23ws.model.Order;
import at.fhtw.be_webeng_23ws.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/orders")
    public Order createOrder(@RequestBody @Valid Order order) {
        return orderService.createOrder(order);
    }
}
