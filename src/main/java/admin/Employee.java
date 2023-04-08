package admin;

import bank.Branch;

public class Employee extends Admin{
    public Employee(String employeeId, String name, Positions position, String manager, double salary, Branch branch) {
        super(employeeId, name, position, manager, salary, branch);
    }
}
