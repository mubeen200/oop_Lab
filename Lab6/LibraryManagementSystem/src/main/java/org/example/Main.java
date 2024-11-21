package org.example;

public class Main {
    public static void main(String[] args) {

        Library library = new Library("City Library");


        LibraryBranch branch1 = new LibraryBranch("Karachi");
        LibraryBranch branch2 = new LibraryBranch("Lahore");

        library.addBranch(branch1);
        library.addBranch(branch2);

        Book book1 = new Book("Harry", "George Bail", "1234567890");
        Book book2 = new Book("James peach", "Kim Soo", "0987654321");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1122334455");

        branch1.addBook(book1);
        branch1.addBook(book2);
        branch2.addBook(book3);

        library.displayBranches();
        branch1.displayBooks();
        branch2.displayBooks();

        branch1.removeBook("1984");
        branch1.displayBooks();
    }
}
