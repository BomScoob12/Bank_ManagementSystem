package person;

import bank.Bank;
import bank.Branch;

import java.math.BigDecimal;
import java.util.Date;

public class Employee extends Person {
    private Positions position;
    private String employeeId;
    private String manager;
    private Branch branch;
    private BigDecimal salary;

    public Employee(String idCard, String firstname, String lastname, String phone, String email, Date registerDate, String userId, String password,
                    String employeeId, Positions position, BigDecimal salary, Branch branch, String manager) {
        super(idCard, firstname, lastname, phone, email, registerDate, userId, password);
        this.employeeId = employeeId;
        this.position = position;
        this.salary = salary;
        this.branch = branch;
        this.manager = manager;
    }

}
