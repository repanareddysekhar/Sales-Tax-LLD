package com.reddy.salestax.models.taxcalculator;
import com.reddy.salestax.models.products.Product;

/**
 * Interface for Taxcalculator  which will be implemented byImportTaxCalculator and SalesTaxCalculator.
 * Main Idea is to use Decorator Design pattern with this as Wrapper interface
 */

public interface TaxCalculator {
    Product getProduct();
    float calcTax();
}
