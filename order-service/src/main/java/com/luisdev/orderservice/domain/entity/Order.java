package com.luisdev.orderservice.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Order {

    private UUID id;
    private String customerName;
    private BigDecimal amount;
    private LocalDateTime createdAt;

    public Order(UUID id, String customerName, BigDecimal amount) {
        this.id = id;
        this.customerName = customerName;
        this.amount = amount;
        this.createdAt = LocalDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}