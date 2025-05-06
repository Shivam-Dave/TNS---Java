package com.yourname.assignment.utilities;

import com.yourname.assignment.employees.*;


//  EmployeeUtilities class - Utility methods for employee operations.
 
public class EmployeeUtilities {

    /**
     * Prints basic employee details.
     * @param e Employee object
     */
    public static void printEmployeeDetails(Employee e) {
        System.out.println("Name: " + e.getName());
        System.out.println("Employee ID: " + e.getEmployeeId());
        System.out.println("Salary: " + e.getSalary());

        if (e instanceof Manager) {
            System.out.println("Department: " + ((Manager) e).getDepartment());
        } else if (e instanceof Developer) {
            System.out.println("Programming Language: " + ((Developer) e).getProgrammingLanguage());
        }
    }

    /**
     * Gives a raise to an employee by a percentage.
     * @param e Employee object
     * @param percent Percentage increase
     */
    public static void giveRaise(Employee e, double percent) {
        double newSalary = e.getSalary() * (1 + percent / 100);
        e.setSalary(newSalary);
    }
}
