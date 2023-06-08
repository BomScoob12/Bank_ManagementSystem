package accounts;

import person.Customer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Account {
    private int id;
    private Customer customer;
    private LocalDateTime openingAccount;
    private BigDecimal currentBalance;
    private BigDecimal interestRate;
    private String accountType;

    public Account(int id, Customer customer, LocalDateTime openingAccount, BigDecimal currentBalance, BigDecimal interestRate, String accountType) {
        this.id = id;
        this.customer = customer;
        this.openingAccount = openingAccount;
        this.currentBalance = currentBalance;
        this.interestRate = interestRate;
        this.accountType = accountType;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getOpeningAccount() {
        return openingAccount;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public String getAccountType() {
        return accountType;
    }
}
