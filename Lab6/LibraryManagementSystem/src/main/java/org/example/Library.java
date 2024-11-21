package org.example;

import java.util.ArrayList;

class Library {
    private String name;
    private ArrayList<LibraryBranch> branches;

    public Library(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public void addBranch(LibraryBranch branch) {
        branches.add(branch);
        System.out.println("Branch " + branch.branchName + " has been added to " + name + " library.");
    }

    public void displayBranches() {
        System.out.println("Branches in " + name + " library:");
        for (LibraryBranch branch : branches) {
            System.out.println("\t" + branch.branchName);
        }
    }
}
