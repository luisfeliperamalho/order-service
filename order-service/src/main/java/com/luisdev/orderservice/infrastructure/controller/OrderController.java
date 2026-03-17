package com.luisdev.orderservice.infrastructure.controller;

import com.luisdev.orderservice.application.dto.CreateOrderRequest;
import com.luisdev.orderservice.application.usecase.CreateOrderUseCase;
import com.luisdev.orderservice.domain.entity.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final CreateOrderUseCase createOrderUseCase;

    public OrderController(CreateOrderUseCase createOrderUseCase) {
        this.createOrderUseCase = createOrderUseCase;
    }

    @GetMapping
    public String test() {
        return "OK";
    }

    @PostMapping
    public Order create(@RequestBody CreateOrderRequest request) {
        return createOrderUseCase.execute(request);
    }
}