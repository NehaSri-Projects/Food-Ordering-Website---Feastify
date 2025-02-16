package com.Feastify.service;

import com.Feastify.Exception.CartException;
import com.Feastify.Exception.CartItemException;
import com.Feastify.Exception.FoodException;
import com.Feastify.Exception.UserException;
import com.Feastify.model.Cart;
import com.Feastify.model.CartItem;
import com.Feastify.model.Food;
import com.Feastify.model.User;
import com.Feastify.request.AddCartItemRequest;
import com.Feastify.request.UpdateCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
