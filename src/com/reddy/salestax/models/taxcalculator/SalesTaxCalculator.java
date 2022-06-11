package com.reddy.salestax.models.taxcalculator;

import com.reddy.salestax.models.products.Product;

public class SalesTaxCalculator implements TaxCalculator{
    private final static float SALES_TAX_RATE = 0.1f;
    TaxCalculator taxCalculator;

    public SalesTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    @Override
    public Product getProduct() {
        return taxCalculator.getProduct();
    }

    @Override
    public float calcTax() {
        return (float) (taxCalculator.calcTax() + getProduct().getPrice() * SALES_TAX_RATE);
    }
}
