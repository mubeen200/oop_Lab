package org.example;
import java.util.ArrayList;
class LibraryBranch {
    protected String branchName;
    private ArrayList<Book> books;

    public LibraryBranch(String branchName) {
        this.branchName = branchName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " has been added to " + branchName + " branch.");
    }

    public boolean removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println(book.getTitle() + " has been removed from " + branchName + " branch.");
                return true;
            }
        }
        System.out.println("Book not found in " + branchName + " branch.");
        return false;
    }

    public void displayBooks() {
        System.out.println("Books in " + branchName + " branch:");
        for (Book book : books) {
            System.out.println("\t" + book);
        }
    }
}

