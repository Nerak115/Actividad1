package com.example;

public class Producto {

    // Instance attributes
    private String id;
    private String title;
    private double price;
    private int quantity;

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString method
    @Override
    public String toString() {
        return "Product [ID: " + id +
               ", Title: " + title +
               ", Price: " + price +
               ", Quantity: " + quantity + "]";
    }
    
}
