package com.luisdev.orderservice.infrastructure.persistence.repository;

import com.luisdev.orderservice.domain.entity.Order;
import com.luisdev.orderservice.domain.repository.OrderRepository;
import com.luisdev.orderservice.infrastructure.persistence.entity.OrderEntity;
import com.luisdev.orderservice.infrastructure.persistence.mapper.OrderMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    private final OrderJpaRepository jpaRepository;

    public OrderRepositoryImpl(OrderJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Order save(Order order) {

        OrderEntity entity = OrderMapper.toEntity(order);

        OrderEntity saved = jpaRepository.save(entity);

        return OrderMapper.toDomain(saved);
    }

    @Override
    public Optional<Order> findById(UUID id) {

        return jpaRepository
                .findById(id)
                .map(OrderMapper::toDomain);
    }
}