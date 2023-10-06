package com.example;

import java.util.ArrayList;

public class Basket {
    private int capacity;
    private ArrayList<Fruit> fruits;

    public Basket(int capacity) {
        this.capacity=capacity;
        this.fruits=new ArrayList<Fruit>();

        public String getFruit();
            return this.getFruit;
        // TODO: Initialize the attributes (and initialize the fruits list)
    }

    public void addFruit(Fruit fruit) {
        this.fruits.add(fruit);
        if(this.fruits.size()<this.capacity){
            this.fruits.add(fruit);
        }
    
        // TODO: Add the fruit to the basket IF THERE IS SPACE!
    }

    public void removeFruit(Fruit fruit) {
        fruits.remove(fruit);
        // TODO: Remove the fruit from the basket
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
}
