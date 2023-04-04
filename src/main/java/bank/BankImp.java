package bank;

import customer.Customer;

import java.util.List;

public class BankImp implements Bank {
    @Override
    public boolean add(Customer customer) {
        return false;
    }

    @Override
    public boolean add(Employee employee) {
        return false;
    }

    @Override
    public boolean add(Account account) {
        return false;
    }

    @Override
    public boolean add(Loan loan) {
        return false;
    }

    @Override
    public boolean add(Branch branch) {
        return false;
    }

    @Override
    public boolean add(Transaction transaction) {
        return false;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return null;
    }

    @Override
    public Customer findCustomer(String param) {
        return null;
    }

    @Override
    public List<Employee> findAllEmployees() {
        return null;
    }

    @Override
    public Employee findEmployee(String param) {
        return null;
    }

    @Override
    public List<Account> findAccountsOfCustomer() {
        return null;
    }

    @Override
    public List<Loan> findLoansOfCustomer() {
        return null;
    }

    @Override
    public List<Transaction> findTransactionsOfAccount() {
        return null;
    }

    @Override
    public List<Transaction> findTransactionsOfCustomer() {
        return null;
    }

    @Override
    public String getTransactionDetails() {
        return null;
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public boolean update(Employee employee) {
        return false;
    }

    @Override
    public boolean update(Account account) {
        return false;
    }

    @Override
    public boolean update(Loan loan) {
        return false;
    }

    @Override
    public boolean update(Branch branch) {
        return false;
    }

    @Override
    public boolean delete(Customer customer) {
        return false;
    }

    @Override
    public boolean delete(Employee employee) {
        return false;
    }

    @Override
    public boolean delete(Account account) {
        return false;
    }

    @Override
    public boolean delete(Loan loan) {
        return false;
    }

    @Override
    public boolean delete(Branch branch) {
        return false;
    }
// Implementation of Bank methods
}
