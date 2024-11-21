package org.example;

class Company {
    private String name;
    private Store[] arrayStore;
    private int nbStore;

    public Company(String name) {
        this.name = name;
        this.arrayStore = new Store[10];
        this.nbStore = 0;
    }

    public void addStore(Store store) {
        if (nbStore < 10) {
            arrayStore[nbStore++] = store;
        } else {
            System.out.println("Cannot add more stores. Maximum capacity reached.");
        }
    }

    public int searchNbOfStore(String productName) {
        int count = 0;
        for (int i = 0; i < nbStore; i++) {
            if (arrayStore[i].searchProduct(productName)) {
                count++;
            }
        }
        return count;
    }

    public void displayAll() {
        System.out.println("Stores in Company " + name + ":");
        for (int i = 0; i < nbStore; i++) {
            System.out.println("\t" + arrayStore[i].getName());
        }
    }
}

