package accounts;

import java.util.Date;

public class CurrentAccount extends Customer {
    CurrentAccount(String idCard, String firstname, String lastname, String phone, String email, Date registerDate, String userId, String password) {
        super(idCard, firstname, lastname, phone, email, registerDate, userId, password);
    }
    CurrentAccount(String idCard, String firstname, String lastname, String phone, Date registerDate, String userId, String password) {
        super(idCard, firstname, lastname, phone, registerDate, userId, password);
    }
}
