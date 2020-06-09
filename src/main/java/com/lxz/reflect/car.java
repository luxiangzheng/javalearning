package com.lxz.reflect;

public class car {
    private String brand;
    private String color;
    private int maxSpead;


    public car(){}

    public car(String brand, String color, int maxSpead) {
        this.brand = brand;
        this.color = color;
        this.maxSpead = maxSpead;
    }

    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", maxSpead=" + maxSpead +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpead() {
        return maxSpead;
    }

    public void setMaxSpead(int maxSpead) {
        this.maxSpead = maxSpead;
    }
    public void introduce(){
        System.out.print("brand:"+brand+"color:"+color+"maxSpead:"+maxSpead);
    }
}
