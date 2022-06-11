package com.reddy.salestax.services;

import com.reddy.salestax.models.products.Product;
import com.reddy.salestax.models.taxcalculator.TaxCalculator;

public class TaxCalculatorService implements TaxCalculator {
    Product product;

    public TaxCalculatorService(Product product) {
        this.product = product;
    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public float calcTax() {
        return 0;
    }
}
