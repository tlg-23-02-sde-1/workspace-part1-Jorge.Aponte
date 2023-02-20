package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);      // delegate to superclass ctor for name, hireDate
        // registerIn401K()         // reason why you would use "this" is on line 18 to register emp if salaried
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);       // delegate to neighboring ctor for name, hireDate, & use the registerIN401k()
        setSalary(salary);          // handle salary myself, by delegating to its setter
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: name=" + getName() + ", hireDate=" + getHireDate()
                + ", salary=$" + getSalary();
    }
}