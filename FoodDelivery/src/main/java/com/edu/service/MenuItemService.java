package com.edu.service;
import java.util.List;
import com.edu.dao.MenuItem;



public interface MenuItemService {
    MenuItem createMenuItem(MenuItem menuItem);
    MenuItem getMenuItemById(Long id);
    List<MenuItem> getAllMenuItems();
    void deleteMenuItem(Long id);
}
