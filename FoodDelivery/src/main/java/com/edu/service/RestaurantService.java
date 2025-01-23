package com.edu.service;

import java.util.List;

import com.edu.dao.Restaurant;

public interface RestaurantService {

	Restaurant createRestaurant(Restaurant restaurant);

	Restaurant getRestaurantById(Long id);

	void deleteRestaurant(Long id);

	List<Restaurant> getAllRestaurants();

}
