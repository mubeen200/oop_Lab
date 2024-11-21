package org.example;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("TV", 4, 34000);
        Product p2 = new Product("Bicycle", 4, 5500);
        Product p3 = new Product("Fridge", 3, 70000);

        Store store1 = new Store("Electronics Store", "Downtown");
        Store store2 = new Store("Sports Store", "Mall");

        store1.addProduct(p1);
        store1.addProduct(p2);
        store2.addProduct(p2);
        store2.addProduct(p3);

        Company company = new Company("Tech Solutions Inc.");
        company.addStore(store1);
        company.addStore(store2);

        company.displayAll();

        store1.displayAll();
        store2.displayAll();

        String productName = "Bicycle";
        int storeCount = company.searchNbOfStore(productName);
        System.out.println("Number of stores containing '" + productName + "': " + storeCount);
    }
}
