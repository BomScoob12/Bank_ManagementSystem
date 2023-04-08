package bank;

import accounts.CurrentAccount;
import accounts.FixedDepositAccount;
import accounts.SavingAccount;
import admin.Admin;
import accounts.Person;

import java.util.List;

public interface Bank {
    //add new account
    boolean add(CurrentAccount currentAccount);
    boolean add(SavingAccount savingAccount);
    boolean add(FixedDepositAccount fixedDepositAccount);
    boolean add(Admin admin);
    boolean add(Branch branch);
    boolean add(Transaction transaction);

    //rename or something
    boolean update(Admin admin);

    //delete object
    boolean delete(Person person);
    boolean delete(Admin admin);
    boolean delete(Branch branch);
    boolean delete(Transaction transaction);

    //customer
    boolean withdraw(double amount);
    boolean desposit(double amount);

    List<Person> findAccountCustomer(int id);
    List<Person> findAccountCustomer(String firstname, String lastname);
    List<Person> listAllAccount();
    String viewTransaction();
}
