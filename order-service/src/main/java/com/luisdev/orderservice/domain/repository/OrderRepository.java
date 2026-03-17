package com.luisdev.orderservice.domain.repository;

import com.luisdev.orderservice.domain.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrderRepository {

    Order save(Order order);

    Optional<Order> findById(UUID id);
}