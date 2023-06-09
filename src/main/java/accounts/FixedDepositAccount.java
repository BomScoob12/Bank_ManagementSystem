package accounts;

import person.Customer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class FixedDepositAccount extends Account{
    public FixedDepositAccount(int id, Customer customer, LocalDateTime openingAccount, BigDecimal currentBalance) {
        super(id,
                customer,
                openingAccount,
                currentBalance,
                AccountType.FIXED.getAccountType(),
                AccountType.FIXED.getRate());
    }
}
