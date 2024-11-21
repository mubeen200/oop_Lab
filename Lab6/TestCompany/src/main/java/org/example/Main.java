package org.example;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 10, 1500.0);
        Product product2 = new Product("Smartphone", 20, 800.0);
        Product product3 = new Product("Tablet", 15, 500.0);

        Store store1 = new Store("Electronics Store", "Downtown");
        Store store2 = new Store("Gadget Store", "Mall");
        Store store3 = new Store("Tech Warehouse", "Industrial Area");

        store1.addProduct(product1);
        store1.addProduct(product2);

        store2.addProduct(product2);
        store2.addProduct(product3);

        store3.addProduct(product1);
        store3.addProduct(product3);

        Company company = new Company("Tech Solutions Inc.");
        company.addStore(store1);
        company.addStore(store2);
        company.addStore(store3);

        company.displayAll();

        store1.displayAll();
        store2.displayAll();
        store3.displayAll();

        String productName = "Smartphone";
        int storeCount = company.searchNbOfStore(productName);
        System.out.println("Number of stores containing '" + productName + "': " + storeCount);

        Product deletedProduct = store1.deleteProduct("Laptop");
        if (deletedProduct != null) {
            System.out.println("Deleted Product: " + deletedProduct);
        } else {
            System.out.println("Product not found for deletion.");
        }
        store1.displayAll();
    }
}

