package com.example.emtiaz.resturent.Food;

/**
 * Created by emtiaz on 3/23/17.
 */

public class FoodDataProvider {

    private int food_pic;
    private String food_name;
    private String price;


    public String getPrice() {
        return price;
    }

    public  FoodDataProvider(int food_pic, String food_name, String price){
        this.setFood_pic(food_pic);
        this.setFood_name(food_name);
        this.setPrice(price);
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public int getFood_pic() {
        return food_pic;
    }

    public void setFood_pic(int food_pic) {
        this.food_pic = food_pic;
    }
}
