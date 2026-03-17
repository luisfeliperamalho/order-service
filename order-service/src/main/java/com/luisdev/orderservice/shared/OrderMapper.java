package com.luisdev.orderservice.infrastructure.persistence.mapper;

import com.luisdev.orderservice.domain.entity.Order;
import com.luisdev.orderservice.infrastructure.persistence.entity.OrderEntity;

public class OrderMapper {

    public static OrderEntity toEntity(Order order) {

        OrderEntity entity = new OrderEntity();
        entity.setId(order.getId());
        entity.setCustomerName(order.getCustomerName());
        entity.setAmount(order.getAmount());
        entity.setCreatedAt(order.getCreatedAt());

        return entity;
    }

    public static Order toDomain(OrderEntity entity) {

        return new Order(
                entity.getId(),
                entity.getCustomerName(),
                entity.getAmount()
        );
    }
}