package com.pets.cal;
public class Dog {
    private String name;
    private Double weight;
    private Double foodAmount;

    public Dog(String name, Double weight, Double foodAmount) {
        this.name = name;
        this.weight = weight;
        this.foodAmount = foodAmount;
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getFoodAmount() {
        return foodAmount;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", foodAmount=" + foodAmount +
                '}';
    }
}
