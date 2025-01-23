package com.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.dao.MenuItem;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {}
