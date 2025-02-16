package com.Feastify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Feastify.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
