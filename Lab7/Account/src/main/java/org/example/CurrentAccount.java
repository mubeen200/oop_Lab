package org.example;

class CurrentAccount extends Account {
    public CurrentAccount(int AccountNo, String AccountBranch, Member AccountOwner, double AccountBalance) {
        super(AccountNo, AccountBranch, AccountOwner, AccountBalance, "Current");
    }
}

