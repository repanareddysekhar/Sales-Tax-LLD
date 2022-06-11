package com.reddy.salestax;

import com.reddy.salestax.models.products.Product;
import com.reddy.salestax.models.products.ProductFactory;
import com.reddy.salestax.services.ReceiptService;

import static com.reddy.salestax.models.products.ProductType.*;

public class SalesTaxDriver {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();

        // Input 1
        Product book = productFactory.createPorduct("book", 12.49, 1, false, BOOK);
        Product cd = productFactory.createPorduct("music CD", 14.99, 1, false, OTHER);
        Product chocolate = productFactory.createPorduct("chocolate", 0.85, 1, false, FOOD);

        ReceiptService receiptService = new ReceiptService();
        receiptService.addItem(book).addItem(cd).addItem(chocolate);
        System.out.println("Output 1:");
        receiptService.printReceipt();

        //clear the list of products for next receipt
        receiptService.clearProductsList();

        // Input 2
        Product imported_chocolate = productFactory.createPorduct("imported box of chocolate", 10.00, 1, true, FOOD);
        Product imported_perfume = productFactory.createPorduct("imported bottle of perfume", 47.50, 1, true,  OTHER);

        receiptService.addItem(imported_chocolate).addItem(imported_perfume);
        System.out.println("\nOutput 2:");
        receiptService.printReceipt();

        //clear the list of products for next receipt
        receiptService.clearProductsList();

        // Input 3
        Product imported_bottle_of_perfume = productFactory.createPorduct("imported bottle of perfume", 27.99, 1, true, OTHER);
        Product bottle_of_perfume = productFactory.createPorduct("bottle of perfume", 18.99, 1, false, OTHER);
        Product headache_pills = productFactory.createPorduct("packet of headache pills", 9.75, 1, false, MEDICAL);
        Product imported_chocolate_box = productFactory.createPorduct("box of imported chocolates", 11.25, 1, true, FOOD);

        receiptService.addItem(imported_bottle_of_perfume).addItem(bottle_of_perfume).addItem(headache_pills).addItem(imported_chocolate_box);
        System.out.println("\nOutput 3:");
        receiptService.printReceipt();
    }
}
