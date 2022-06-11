package com.reddy.salestax.models.products;

/**
 * Abstract class for Product from which product_type classes will inherit.
 */

public abstract class Product {
    private String productName;
    private double price;
    private int quantity;
    private boolean isImported;

    public Product(String productName, double price, int quantity, boolean isImported) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.isImported = isImported;
    }

    public double getPrice() {
        return quantity * price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isImported() {
        return isImported;
    }

    public void setImported(boolean imported) {
        isImported = imported;
    }
}
