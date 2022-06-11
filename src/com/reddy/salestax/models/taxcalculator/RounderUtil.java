package com.reddy.salestax.models.taxcalculator;

import com.reddy.salestax.models.products.Product;

import java.util.Map;

public class RounderUtil implements TaxCalculator{
    TaxCalculator taxCalculator;

    public RounderUtil(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    @Override
    public Product getProduct() {
        return taxCalculator.getProduct();
    }

    @Override
    public float calcTax() {
        return (float) Math.ceil(taxCalculator.calcTax() / 0.05f) * 0.05f;
    }
}
