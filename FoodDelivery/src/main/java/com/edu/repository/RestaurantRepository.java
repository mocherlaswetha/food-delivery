package com.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.dao.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {}