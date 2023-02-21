package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    double rate;
    double hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);          // delegate to superclass ctor for name, hireDate
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);           // delegate to neighboring ctor for name, hireDate
        setRate(rate);                  // handle rate myself, by delegating to setter
        setHours(hours);                // ditto
    }

    @Override
    public void pay() {
        System.out.printf("%s is paid hourly $%.2f\n",getName(),(getRate() * getHours()));
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + ", rate=$" + getRate() + ", hours=" + getHours();
    }
}