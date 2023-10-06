package com.example;

public class Fruit {
    private String name;
    private String color;
    private String taste;
    private double weight;

    public Fruit(String name, String color, String taste, double weight) {
        this.name = name;
        this.color = color;
        this.taste = taste;
        this.weight = weight;
    }
    public String getName() {
        return this.name;
    }
    public String getColor() {
        return this.color;
    }
    public String getTaste() {
        return this.taste;
    }
    public double getWeight() {
        return this.weight;
    } 
    public void setName(String newName) {
        this.name = newName;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }
    public void setTaste(String newTaste) {
        this.taste = newTaste;
    }
    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }


    // TODO: Initialize the attributes
}

// TODO: Implement getters, setters, and any other methods you find necessary
