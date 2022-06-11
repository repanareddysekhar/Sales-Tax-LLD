package com.reddy.salestax.services;

import com.reddy.salestax.models.products.ProductFactory;

/**
 * ProductFactoryService for creating particular product
 */
public class ProductFactoryService {
    ProductFactory productFactory;

    public ProductFactoryService(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }
}
