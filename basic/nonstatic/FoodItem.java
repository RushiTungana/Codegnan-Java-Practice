package com.basic.nonstatic;

class Food {
	private String foodName;
	private boolean veg;
	private String category;
	private int price;
	private String restaurantName;
	private double rating;
    

    public Food() {
        System.out.println(this);
        System.out.println("Enter the food name: ");
        System.out.println("Enter whether it is veg: ");
        System.out.println("Enter the category: ");
        System.out.println("Enter the price: ");
        System.out.println("Enter the restaurant name: ");
        System.out.println("Enter the rating: ");
     
    }

    public Food(String foodName, boolean veg, String category, int price,
                    String restaurantName, double rating) {
        this.foodName = foodName;
        this.veg = veg;
        this.category = category;
        this.price = price;
        this.restaurantName = restaurantName;
        this.rating = rating;
       
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public boolean isVeg() {
        return veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    public void foodDetail() {
        System.out.println("Food Name: " + foodName);
        System.out.println("Veg: " + veg);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Rating: " + rating);
    }
}

public class FoodItem {
    public static void main(String[] args) {

        Food f1 = new Food();

        f1.setFoodName("Chicken Biryani");
        f1.setVeg(false);
        f1.setCategory("Main Course");
        f1.setPrice(250);
        f1.setRestaurantName("Paradise");
        f1.setRating(4.5);
        f1.foodDetail();
        System.out.println("=============");

        Food f2 = new Food();

        f2.setFoodName("Masala Dosa");
        f2.setVeg(true);
        f2.setCategory("Breakfast");
        f2.setPrice(120);
        f2.setRestaurantName("Saravana Bhavan");
        f2.setRating(4.3);
        f2.foodDetail();
        System.out.println("=============");
    }
}