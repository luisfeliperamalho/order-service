package com.luisdev.orderservice.application.dto;

import java.math.BigDecimal;

public record CreateOrderRequest(
        String customerName,
        BigDecimal amount
) {}