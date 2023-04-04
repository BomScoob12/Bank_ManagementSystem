package bank;

import customer.Customer;

import java.util.List;

public interface Bank {
    // Create
    boolean add(Customer customer);
    boolean add(Employee employee);
    boolean add(Account account);
    boolean add(Loan loan);
    boolean add(Branch branch);

    boolean add(Transaction transaction);

    // Read
    List<Customer>findAllCustomers();
    Customer findCustomer(String param);

    List<Employee>findAllEmployees();
    Employee findEmployee(String param);

    List<Account>findAccountsOfCustomer();
    List<Loan>findLoansOfCustomer();

    List<Transaction> findTransactionsOfAccount();
    List<Transaction> findTransactionsOfCustomer();
    String getTransactionDetails();

    // Update
    boolean update(Customer customer);
    boolean update(Employee employee);
    boolean update(Account account);
    boolean update(Loan loan);
    boolean update(Branch branch);

    // Delete
    boolean delete(Customer customer);
    boolean delete(Employee employee);
    boolean delete(Account account);
    boolean delete(Loan loan);
    boolean delete(Branch branch);
}
