package com.luisdev.orderservice.application.usecase;

import com.luisdev.orderservice.application.dto.CreateOrderRequest;
import com.luisdev.orderservice.domain.entity.Order;
import com.luisdev.orderservice.domain.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CreateOrderUseCase {

    private final OrderRepository repository;

    public CreateOrderUseCase(OrderRepository repository) {
        this.repository = repository;
    }

    public Order execute(CreateOrderRequest request) {

        Order order = new Order(
                UUID.randomUUID(),
                request.customerName(),
                request.amount()
        );

        return repository.save(order);
    }
}