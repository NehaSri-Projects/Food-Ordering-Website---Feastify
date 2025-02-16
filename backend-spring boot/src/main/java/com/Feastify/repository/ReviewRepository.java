package com.Feastify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Feastify.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
