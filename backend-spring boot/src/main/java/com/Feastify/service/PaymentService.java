package com.Feastify.service;

import com.Feastify.model.Order;
import com.Feastify.model.PaymentResponse;
import com.stripe.exception.StripeException;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
