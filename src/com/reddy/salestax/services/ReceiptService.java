package com.reddy.salestax.services;

import com.reddy.salestax.models.products.OtherProduct;
import com.reddy.salestax.models.products.Product;
import com.reddy.salestax.models.taxcalculator.ImportTaxCalculator;
import com.reddy.salestax.models.taxcalculator.RounderUtil;
import com.reddy.salestax.models.taxcalculator.SalesTaxCalculator;
import com.reddy.salestax.models.taxcalculator.TaxCalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * ReceiptService for creating receipts and printing it along with tax rates.
 */

public class ReceiptService {
    private List<Product> productsList;

    public ReceiptService() {
        this.productsList = new ArrayList<>();
    }

    public ReceiptService addItem(Product product) {
        productsList.add(product);
        return this;
    }

    public void clearProductsList() {
        productsList.clear();
    }

    public void printReceipt() {
        float total_sales_tax = 0.0f;
        float total_price = 0.0f;
        for(Product product : productsList) {
            TaxCalculator calc = new TaxCalculatorService(product);
            if(product instanceof OtherProduct)
                calc = new SalesTaxCalculator(calc);
            if(product.isImported())
                calc = new ImportTaxCalculator(calc);

            calc = new RounderUtil(calc);
            total_price += product.getPrice();
            float sales_tax = calc.calcTax();
            total_sales_tax += sales_tax;
            System.out.println(product.getQuantity() + " " + product.getProductName() + ": " + (float) (product.getPrice() + sales_tax) );
        }
        System.out.printf("Sales Tax: %.2f\n", total_sales_tax);
        System.out.printf("Total: %.2f\n", (total_price + total_sales_tax));
    }
}
