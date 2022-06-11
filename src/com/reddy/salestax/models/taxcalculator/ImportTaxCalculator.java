package com.reddy.salestax.models.taxcalculator;

import com.reddy.salestax.models.products.Product;

public class ImportTaxCalculator implements TaxCalculator{
    private final static float IMPORT_TAX_RATE = 0.05f;
    TaxCalculator taxCalculator;

    public ImportTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    @Override
    public Product getProduct() {
        return taxCalculator.getProduct();
    }

    @Override
    public float calcTax() {
        return (float) (taxCalculator.calcTax() + getProduct().getPrice() * IMPORT_TAX_RATE);
    }
}
