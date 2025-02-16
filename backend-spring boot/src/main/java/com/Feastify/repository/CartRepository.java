package com.Feastify.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Feastify.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	 Optional<Cart> findByCustomer_Id(Long userId);
}
