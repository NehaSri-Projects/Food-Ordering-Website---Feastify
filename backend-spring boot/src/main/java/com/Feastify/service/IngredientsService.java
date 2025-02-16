package com.Feastify.service;

import java.util.List;

import com.Feastify.Exception.FoodException;
import com.Feastify.Exception.RestaurantException;
import com.Feastify.model.Food;
import com.Feastify.model.IngredientCategory;
import com.Feastify.model.IngredientsItem;
import com.Feastify.repository.IngredientsCategoryRepository;

public interface IngredientsService {
	
	public IngredientCategory createIngredientsCategory(
			String name,Long restaurantId) throws RestaurantException;

	public IngredientCategory findIngredientsCategoryById(Long id) throws Exception;

	public List<IngredientCategory> findIngredientsCategoryByRestaurantId(Long id) throws Exception;
	
	public List<IngredientsItem> findRestaurantsIngredients(
			Long restaurantId);

	
	public IngredientsItem createIngredientsItem(Long restaurantId, 
			String ingredientName,Long ingredientCategoryId) throws Exception;

	public IngredientsItem updateStoke(Long id) throws Exception;
	
}
