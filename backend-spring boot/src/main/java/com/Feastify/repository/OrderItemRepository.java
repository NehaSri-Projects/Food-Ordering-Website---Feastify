package com.Feastify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Feastify.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
