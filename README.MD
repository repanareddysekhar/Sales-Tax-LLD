Sales Tax problem solution.
Language: JAVA

Requirements:
1) Able to categorize goods into different categories like books, food, medical products, clothes etc.
2) Distinguish between imported vs not imported.
3) For a list of goods, calculate the tax
-> For All goods, 10% as sales tax. Excemption on books, food and medical products.
-> For all imported goods, 5% additional tax with no excemption.
4) Print receipt with  prices(including tax) of all products, Sales tax and Total price.


The models in the project would be:
Product - [BOOK, MEDICAL, FOOD, OTHER]
--> Design pattern used to create Products models: Factory Design Pattern
TaxCalculator - [SalesTaxCalculator, ImportTaxCalculator]
--> Design pattern used to create Taxcalculator models: Decorator(wrapper)
