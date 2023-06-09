package accounts;

import person.Customer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SavingAccount extends Account{
    public SavingAccount(int id, Customer customer, LocalDateTime openingAccount, BigDecimal currentBalance) {
        super(id,
                customer,
                openingAccount,
                currentBalance,
                AccountType.SAVING.getAccountType(),
                AccountType.SAVING.getRate());
    }
}
