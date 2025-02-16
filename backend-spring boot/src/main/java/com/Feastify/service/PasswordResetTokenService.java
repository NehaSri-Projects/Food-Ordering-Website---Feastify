package com.Feastify.service;

import com.Feastify.model.PasswordResetToken;

public interface PasswordResetTokenService {

	public PasswordResetToken findByToken(String token);

	public void delete(PasswordResetToken resetToken);

}
