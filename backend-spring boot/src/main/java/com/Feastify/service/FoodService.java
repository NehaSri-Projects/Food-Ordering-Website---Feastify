package com.Feastify.service;

import java.util.List;

import com.Feastify.Exception.FoodException;
import com.Feastify.Exception.RestaurantException;
import com.Feastify.model.Category;
import com.Feastify.model.Food;
import com.Feastify.model.Restaurant;
import com.Feastify.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
