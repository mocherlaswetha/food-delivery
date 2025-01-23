package com.edu.dao;
import java.util.List;

import com.edu.service.MenuItemService;

import jakarta.persistence.*;
@Entity
@Table(name = "menu_items")
public class MenuItem{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    public MenuItem() {}

    public MenuItem(Long id, String name, double price, String description, Restaurant restaurant) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.restaurant = restaurant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

	public MenuItemService getMenuItemById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<MenuItemService> getAllMenuItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteMenuItem(Long id) {
		// TODO Auto-generated method stub
		
	}

	public MenuItem createMenuItem(MenuItemService menuItem) {
		// TODO Auto-generated method stub
		return null;
	}
}

