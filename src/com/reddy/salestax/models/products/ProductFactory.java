package com.reddy.salestax.models.products;

/**
 * Product Factory class which creates a particular product object at runtime and return it.
 */

public class ProductFactory {
    public Product createPorduct(String productName, double price, int quantity, boolean isImported, ProductType productType) {
        switch(productType) {
            case BOOK :
                return new BookProduct(productName, price, quantity, isImported);
            case FOOD:
                return new FoodProduct(productName, price, quantity, isImported);
            case MEDICAL:
                return new MedicalProduct(productName, price, quantity, isImported);
            case OTHER:
                return new OtherProduct(productName, price, quantity, isImported);
            default:
                return null;
        }
    }
}
