/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package classess;

import interfaces.Clonablee;
import interfaces.Comparablee;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 * a simple class to demonstrate interfaces
 * */
public class Employee
        implements Comparable<Employee>, Clonablee<Employee>, Cloneable {
    private int nextInt = new Random().nextInt(10000);
    private String name;
    private final int id;
    private double salary;
    private LocalDate hireDay;

    {
        name = "";
        id = nextInt;
        salary = 0;
        hireDay = LocalDate.now();
    }

    public Employee(String name, double salary, LocalDate hireDay){
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }
    public Employee(String name, double salary){
        this(name, salary, LocalDate.now());
    }
    public Employee(){}
    protected void setSalary(double salary){
        this.salary = salary;
    }
    public void raiseSalary(double percentage){
        this.salary *= (percentage/100);
    }
    public double getSalary(){
        return this.salary;
    }
    public LocalDate getHireDay(){
        return this.hireDay;
    }
    public String getName(){
        return this .name;
    }
    public int getId(){
        return this.id;
    }

    public boolean equals(Employee other){
        return Objects.equals(this.getName(), other.getName()) && this.getId() == other.getId();
    }
    @Override
    public String toString(){
        return "%s[ id= %s, name= %s, salary= %s, hireDay= %s ]\n".formatted(
                this.getClass(), this.getId(),this.getName(), this.getSalary(), this.getHireDay()
        );
    }
    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
    @Override
    public int compareTo(Employee otherEmployee)
            throws ClassCastException{
        if (this.getClass() != otherEmployee.getClass())
            throw new ClassCastException();
        return Integer.compare(this.getId(), otherEmployee.getId());
    }

    public static void main(String... args) throws CloneNotSupportedException {
    }
}
