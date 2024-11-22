package org.example;

public class Main {
    public static void main(String[] args) {

        Member member1 = new Member("Ali", "ali@example.com", "123-456-0890");
        Member member2 = new Member("Bilal", "bilal@example.com", "098-765-0321");
        Member member3 = new Member("Mubeen", "mubeen@example.com", "555-585-5555");

        CurrentAccount currentAccount1 = new CurrentAccount(101, "Karachi Branch", member1, 1500.0);
        CurrentAccount currentAccount2 = new CurrentAccount(102, "Lahore Branch", member2, 2500.0);
        SavingAccount savingAccount = new SavingAccount(103, "Islamabad Branch", member3, 3500.0);

        currentAccount1.displayInfo();
        currentAccount2.displayInfo();
        savingAccount.displayInfo();
    }
}
