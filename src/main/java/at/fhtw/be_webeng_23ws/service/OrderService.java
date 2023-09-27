package at.fhtw.be_webeng_23ws.service;

import at.fhtw.be_webeng_23ws.model.Order;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    List<Order> orders = new ArrayList<>();
    public Order createOrder(Order order) {
        if(LocalTime.now().isAfter(LocalTime.NOON) && order.getAmount() > 4) {
            throw new RuntimeException();
        }
        orders.add(order);
        return order;
    }
}
