package com.Feastify.service;

import java.util.List;

import com.Feastify.Exception.CartException;
import com.Feastify.Exception.OrderException;
import com.Feastify.Exception.RestaurantException;
import com.Feastify.Exception.UserException;
import com.Feastify.model.Order;
import com.Feastify.model.PaymentResponse;
import com.Feastify.model.User;
import com.Feastify.request.CreateOrderRequest;
import com.stripe.exception.StripeException;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
