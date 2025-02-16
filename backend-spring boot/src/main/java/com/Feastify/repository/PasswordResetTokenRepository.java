package com.Feastify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Feastify.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
