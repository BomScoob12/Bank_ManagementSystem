package accounts;

import person.Customer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CurrentAccount extends Account{

    public CurrentAccount(int id, Customer customer, LocalDateTime openingAccount, BigDecimal currentBalance) {
        super(id,
                customer,
                openingAccount,
                currentBalance,
                AccountType.CURRENT.getAccountType(),
                AccountType.CURRENT.getRate());
    }
}
