package person;

import accounts.Account;

import java.time.LocalDateTime;
import java.util.List;

public class Customer extends Person{

    private List<Account> accounts;

    public Customer(String id, String firstname, String lastname, String contactNumber, String email, String address, LocalDateTime registerDate, String username, String passhash) {
        super(id, firstname, lastname, contactNumber, email, address, registerDate, username, passhash);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    //I can get result set and loop to add list to set a new one.
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
