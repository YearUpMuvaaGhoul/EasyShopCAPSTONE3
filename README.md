# EasyShopCAPSTONE3
Capstone 3- Final Easy Shop Ecommerce project

Capstone Overview: EasyShop is an already existing e-commerce application for technology and electronics. Our team was tasked with releasing a new and improved version, by fixing bugs that had been reported by users, implementing and editing existing methods, and adding new features.

This capstone was broken down into phases; 

Phase 1 involved the initial implementation of the ProductsController endpoint, which includes methods for handling HTTP requests to manage products. This phase likely focused on setting up basic CRUD (Create, Read, Update, Delete) operations for products, ensuring that administrators can insert, update, or delete products.

---------------------------------------------------------------------------------------------
Phase 2, as shown in the image, focuses on fixing bugs in the ProductsController endpoint. Specifically, it addresses two main issues:

Bug 1: The product search functionality is returning incorrect results. The task here is to test the search logic and fix any bugs. The search URL has query string parameters such as cat (categoryId), minPrice, maxPrice, and color.

Bug 2: Some products appear to be duplicated. For example, a laptop is listed three times with slight differences in description or price. The issue seems to be that instead of updating an existing product, the system adds a new product each time an update is attempted. The task here is to fix this bug so that administrators can safely update products without creating duplicates.

Phase 2 of the project, emphasizing the need to address specific bugs in the ProductsController. The first bug involves incorrect search results, and the second bug involves duplicate product entries upon updates.

By addressing these bugs, the product management system should become more reliable and user-friendly, ensuring accurate search results and preventing duplicate entries.


-----------------------------------------------------------------------------------------------

Optional Phase 3: Shopping Cart
New Feature: Users should have the ability to add items to their shopping cart. This feature is not yet implemented, although the database already has a shopping cart table.

Key Requirements:
User Authentication: The shopping cart feature is only available to logged-in users.

Persistence: Items added to the cart should persist across sessions. If a user logs out and logs back in, the items in their cart should still be there.

API Endpoints: You need to add methods to the ShoppingCartController for the required REST services.

By completing this phase, you'll enhance the user experience by providing essential e-commerce functionality.
-------------------------------------------------------------------------------------------
Phase 4 (Optional): User Profile Management

Description: Enable users to manage their profiles. This helps youupdate your profile information and save.

This phase Enhances user experience by allowing them to update personal information, making the platform more user-friendly and personalized.
--------------------------------------------------------------------------------------------------
Phase 5 (Optional): Checkout Process - did not complete,

Description: Convert the shopping cart into an order, handling the entire checkout process.

Why Necessary? Completes the e-commerce workflow, enabling users to finalize purchases, which is critical for any online shopping platform.
--------------------------------------------------------------------------------------------------
Potential Future Enhancements:

Description: Plan and prioritize additional features like wishlists, user reviews, order history, advanced search filters, and recommendations.


Wishlist Functionality: Allow users to save items to a wishlist for future reference.

User Reviews and Ratings: Enable users to review and rate products.

Order History: Provide users with access to their past orders and order details.

Advanced Search Filters: Implement more sophisticated search filters for product categories, price ranges, brands, etc.

Recommendations: Offer personalized product recommendations based on user behavior and preferences.

These phases are designed to build a robust and user-friendly e-commerce application, addressing fundamental requirements and progressively adding more sophisticated features to enhance functionality and user satisfaction.
--------------------------------------------------------------------------------------------------



