package person;

import bank.Department;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Employee extends Person{
    private Department department;
    private BigDecimal salary;

    public Employee(String id, String firstname, String lastname, String contactNumber, String email, String address, LocalDateTime registerDate, String username, String passhash, Department dept, BigDecimal salary) {
        super(id, firstname, lastname, contactNumber, email, address, registerDate, username, passhash);
        this.department = dept;
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
