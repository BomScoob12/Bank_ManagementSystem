package accounts;

import java.util.Date;
import java.util.List;

public class Customer extends Person{
    private List<Account> accounts;

    public Customer(String idCard, String firstname, String lastname, String phone, String email, Date registerDate, String userId, String password) {
        super(idCard, firstname, lastname, phone, email, registerDate, userId, password);
    }

    public Customer(String idCard, String firstname, String lastname, String phone, Date registerDate, String userId, String password) {
        super(idCard, firstname, lastname, phone, registerDate, userId, password);
    }

    public boolean add(Account account){
        if (account == null) return false;
        accounts.add(account);
        return true;
    }

}
