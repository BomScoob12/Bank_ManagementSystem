package accounts;

import bank.Branch;
import person.Customer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SavingAccount extends Account{
    public SavingAccount(int id, Customer customer, Branch branch, LocalDateTime openingAccount, BigDecimal currentBalance, BigDecimal interestRate) {
        super(id, customer, openingAccount, currentBalance, interestRate, "saving-account");
    }
}
