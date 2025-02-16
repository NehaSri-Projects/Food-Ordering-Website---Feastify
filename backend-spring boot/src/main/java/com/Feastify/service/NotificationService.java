package com.Feastify.service;

import java.util.List;

import com.Feastify.model.Notification;
import com.Feastify.model.Order;
import com.Feastify.model.Restaurant;
import com.Feastify.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
