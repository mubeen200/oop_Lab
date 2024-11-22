package org.example;

class Account {
    protected int AccountNo;
    protected String AccountBranch;
    protected double AccountBalance;
    protected Member AccountOwner;
    protected String AccountType;

    public Account(int AccountNo, String AccountBranch, Member AccountOwner, double AccountBalance, String AccountType) {
        this.AccountNo = AccountNo;
        this.AccountBranch = AccountBranch;
        this.AccountOwner = AccountOwner;
        this.AccountBalance = AccountBalance;
        this.AccountType = AccountType;
    }

    public String getAccountBranch() {
        return AccountBranch;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public String getOwnerName() {
        return AccountOwner.getMemberName();
    }

    public String getOwnerEmail() {
        return AccountOwner.getMemberEmail();
    }

    public String getOwnerContact() {
        return AccountOwner.getMemberContact();
    }

    public String getAccountType() {
        return AccountType;
    }

    public void displayInfo() {
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Account Number: " + AccountNo);
        System.out.println("Branch: " + AccountBranch);
        System.out.println("Balance: " + AccountBalance);
        System.out.println("Owner: " + AccountOwner.getMemberName());
        System.out.println("Email: " + AccountOwner.getMemberEmail());
        System.out.println("Contact: " + AccountOwner.getMemberContact());
        System.out.println("-------------------------------------");
    }
}

