package org.example;

class Store {
    private String name;
    private String location;
    private Product[] productList;
    private int nbProduct;

    public Store(String name, String location) {
        this.name = name;
        this.location = location;
        this.productList = new Product[100];
        this.nbProduct = 0;
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product p) {
        if (nbProduct < 100) {
            productList[nbProduct++] = p;
        } else {
            System.out.println("Cannot add more products. Maximum capacity reached.");
        }
    }

    public boolean searchProduct(String productName) {
        for (int i = 0; i < nbProduct; i++) {
            if (productList[i].getName().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    public Product deleteProduct(String productName) {
        for (int i = 0; i < nbProduct; i++) {
            if (productList[i].getName().equalsIgnoreCase(productName)) {
                Product deletedProduct = productList[i];
                // Shift the array elements
                for (int j = i; j < nbProduct - 1; j++) {
                    productList[j] = productList[j + 1];
                }
                productList[--nbProduct] = null;
                return deletedProduct;
            }
        }
        return null;
    }

    public void displayAll() {
        System.out.println("Products in Store " + name + ":");
        for (int i = 0; i < nbProduct; i++) {
            System.out.println("\t" + productList[i]);
        }
    }
}

