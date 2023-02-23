/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24),
                2_224.20));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2),
                48.20, 40));
        dept.addEmployee(new SalariedEmployee("Jorge", LocalDate.of(2020, 5, 20),
                2_420.69));
        dept.addEmployee(new HourlyEmployee("Jessica", LocalDate.of(2018, 12, 24),
                52.54, 40));
        dept.addEmployee(new Executive("Jorge Sr.", LocalDate.of(2015, 2, 8),
                34_250));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay all Employees
        System.out.println("\nPay all employees:");
        dept.paysEmployees();

        // holiday break
        System.out.println("\nEmployees on Vacation:");
        dept.holidayBreak();
    }
}