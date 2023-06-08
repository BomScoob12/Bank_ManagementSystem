package accounts;

import bank.Branch;
import person.Customer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class FixedDepositAccount extends Account{
    public FixedDepositAccount(int id, Customer customer, Branch branch, LocalDateTime openingAccount, BigDecimal currentBalance, BigDecimal interestRate) {
        super(id, customer, openingAccount, currentBalance, interestRate, "fixed-deposit-account");
    }
}
