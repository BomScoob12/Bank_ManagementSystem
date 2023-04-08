package accounts;

import bank.Branch;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
    private int id;
    private Customer customer;
    private Branch branch;
    private Date openingAccount;
    private BigDecimal currentBalance;
    private BigDecimal interestRate;

    public Account(int id, Customer customer, Branch branch, Date openingAccount, BigDecimal currentBalance, BigDecimal interestRate) {
        this.id = id;
        this.customer = customer;
        this.branch = branch;
        this.openingAccount = openingAccount;
        this.currentBalance = currentBalance;
        this.interestRate = interestRate;
    }

    boolean withdraw(double amount){
        return false;
    }
    boolean deposit(double amount){
        return false;
    }


}
