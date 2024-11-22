package org.example;

class SavingAccount extends Account {
    public SavingAccount(int AccountNo, String AccountBranch, Member AccountOwner, double AccountBalance) {
        super(AccountNo, AccountBranch, AccountOwner, AccountBalance, "Saving");
    }
}

