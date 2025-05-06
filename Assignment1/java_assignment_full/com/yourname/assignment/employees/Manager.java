package com.yourname.assignment.employees;


//  Manager class - Subclass of Employee.
//  Includes additional attribute for department.
 
public class Manager extends Employee {
    private String department;

    public Manager(String name, String employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
