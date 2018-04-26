package com.sweety.automation;

/**
 * Created by skumari on 1/11/2018.
 */
public class Employee extends Basic {
    public String name; //Instance variable
    private double salary;
    public static int numberOfEmp; //static/class variable

    public Employee(String empName, double empSalary){
        name = empName;
        salary = empSalary;
    }

    public void showDetails(){
        System.out.println("Name of the Employee is " + name);
        System.out.println("Salary of the Employee is " + salary);
    }

    public void totalEmployees(){
        numberOfEmp = numberOfEmp + 1;
        System.out.println("Total number of Employees " + numberOfEmp);
    }
}
