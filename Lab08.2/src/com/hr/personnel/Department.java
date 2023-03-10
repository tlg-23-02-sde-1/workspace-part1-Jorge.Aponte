/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

/**
 * The Department class manages employees.
 * <p>
 * Properties:
 * String name
 * String location
 * Employee[] employees  the Employees in this department.
 * int currentIndex      internal counter for number of employees in the department.
 * <p>
 * Methods (excluding get/set methods):
 * void listEmployees()  print info on all employees in the department.
 * void workEmployees()  make all employees in the department work.
 * String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
    private int currentIndex = 0;  // for dealing with the array

    // constructors
    public Department() {       // a superclass ctor is always called, whether you say this or not!
    }

    public Department(String name, String location) {       // superclass ctor is always called  "super();"
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // where employees were added, i.e., we don't want to hit the "null" slots in the array
        // Question: what is in the array for indices where no Employee was added?  null!
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(employees[i]);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].work();
        }
    }

    // helper method to add an Employee to the array

    // 'emp' is a reference of type Employee, that's pointing to
    // an Employee object
    public void addEmployee(Employee emp) {     // Employee ref to one of Employee, Hourly, Salaried
        employees[currentIndex++] = emp;
    }

    public void paysEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].pay();
        }
    }

    /*
     * "Forced vacation." That is, for all employees that take vacation (SalariedEmployees),
     * make them take vacation.
     */
    public void holidayBreak() {
        for (int i = 0; i < currentIndex; i++) {
            // downcast the Employee reference (employees[i]) to specific type SalariedEmployee
            // then we can call SalariedEmployee-specific methods (like takeVacation())

            // First we "ask" employees[i], "are you really a SalariedEmployee?"
            // NOTE: instanceof does an IS-A check (so it's true for an Executive, also)
            if (employees[i] instanceof SalariedEmployee) {
                // downcast-and-method-call in one shot (Great for calling one method)
                ((SalariedEmployee) employees[i]).takeVacation();

                /* This way below is great if calling more than one method.
                 * SalariedEmployee semp = (SalariedEmployee) employees[i];
                 * semp.takeVacation();
                 */
            }
        }
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department: name=" + getName() + ", location=" + getLocation();
    }
}