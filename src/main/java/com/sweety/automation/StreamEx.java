package com.sweety.automation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

   public static void main(String args[]){
       List<Employee2> employeeDetails = new ArrayList<>();
       employeeDetails.add(new Employee2(1, "khushi", 20000));
       employeeDetails.add(new Employee2(2, "shyam", 30000));
       employeeDetails.add(new Employee2(3, "ram", 40000));
       employeeDetails.add(new Employee2(4, "ramu", 50000));
       List<Integer> employeeSalary = employeeDetails.stream().filter(p -> p.salary > 30000).map(p -> p.salary).collect(Collectors.toList());
        System.out.println(employeeSalary);
        employeeDetails.stream().filter(p -> p.salary > 30000).forEach(p -> System.out.print(p.name + " "));
   }



}

class Employee2{
    int id;
    String name;
    int salary;

    public Employee2(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
