package admin;

import bank.Branch;


public abstract class Admin {
    private String name;
    private Positions position;
    private String employeeId;
    private String manager;
    private Branch branch;
    private double salary;

    public Admin(String employeeId, String name, Positions position, String manager, double salary, Branch branch){
        this.employeeId = employeeId;
        this.name = name;
        this.position = position; //enum class
        this.manager = manager;
        this.salary = salary;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", employeeId='" + employeeId + '\'' +
                ", manager='" + manager + '\'' +
                ", branch=" + branch +
                ", salary=" + salary +
                '}';
    }
}
