package accounts;

import person.Customer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Account {
    private int accountId;
    private Customer customer;
    private final LocalDateTime openingAccountDate;
    private BigDecimal currentBalance;
    private BigDecimal interestRate;
    private final String accountType;

    public Account(int accountId, Customer customer, LocalDateTime openingAccount, BigDecimal currentBalance, String accountType, BigDecimal interestRate ) {
        this.accountId = accountId;
        this.customer = customer;
        this.openingAccountDate = openingAccount;
        this.currentBalance = currentBalance;
        this.interestRate = interestRate;
        this.accountType = accountType;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getOpeningAccountDate() {
        return openingAccountDate;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public String getAccountType() {
        return accountType;
    }

}
