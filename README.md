Food Delivery  Project:
A Food Delivery Spring Boot Project is a web application built using the Spring Boot framework. It allows users to order food online, browse menus from various restaurants, track orders.
Technical Components:
Backend: Spring Boot
For data storage: MySQL
API'S:
UserController.java: Handles user-related operations such as login, registration, and fetching user details.

Example APIs:
POST /api/users/register - Register a new user.
POST /api/users/login - User login.
GET /api/users/{id} - Get user details by ID.
RestaurantController.java: Manages restaurants.

Example APIs:
GET /api/restaurants - Get all restaurants.
POST /api/restaurants - Add a new restaurant.
MenuItemController.java: Manages menu items for restaurants.

Example APIs:
GET /api/restaurants/{id}/menu - Get menu items for a restaurant.
POST /api/menu - Add a new menu item.
OrderController.java: Handles orders placed by customers.

Example APIs:
POST /api/orders - Place an order.
GET /api/orders/{id} - Get order details.
GET /api/orders/user/{userId} - Get all orders by a user.

