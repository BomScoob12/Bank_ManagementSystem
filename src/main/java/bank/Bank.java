package bank;

import accounts.Account;
import person.Customer;
import person.Employee;

import java.util.List;

public interface Bank {
    //add new account
    boolean add(Customer customer);
    boolean add(Employee employee);
    boolean add(Account account);
    boolean add(Transaction transaction);

    //update account
    boolean update(Customer customer);
    boolean update(Employee employee);
    boolean update(Account account);

    //delete account
    boolean delete(Customer customer);
    boolean delete(Employee employee);
    boolean delete(Transaction transaction);

    //read data
    List<Customer>findAllCustomers();
    Customer findCustomer(String name);
    Customer findCustomerByIdCard(String idCard);
    List<Employee>findAllEmployees();
    Employee findEmployee(String name);
    List<Account>findAccountsOfCustomer();

    List<Transaction> findTransactionsOfAccount();
    List<Transaction> findTransactionsOfCustomer();
    String getTransactionDetails();
}
