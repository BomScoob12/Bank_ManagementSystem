package bank;

import accounts.Account;
import Person.Customer;
import Person.Employee;
import accounts.Transaction;

import java.lang.reflect.AccessibleObject;
import java.util.List;

public interface Bank {
    //add new account
    boolean add(Customer customer);
    boolean add(Employee employee);
    boolean add(Account account);
    boolean add(Branch branch);
    boolean add(Transaction transaction);

    //update account
    boolean update(Customer customer);
    boolean update(Employee employee);
    boolean update(Account account);
    boolean update(Branch branch);

    //delete account
    boolean delete(Customer customer);
    boolean delete(Employee employee);
    boolean delete(Branch branch);
    boolean delete(Transaction transaction);

    //read data
    List<Customer> findAccountCustomer(int id);
    List<Customer> findAccountCustomer(String firstname, String lastname);
    List<Customer> listAllAccount();
    String viewTransaction();
}
