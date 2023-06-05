/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package classess;

import interfaces.Clonablee;
import interfaces.Comparablee;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.function.BiFunction;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

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
    public Employee(String name){
        this(name, 0);
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

    public static void main(String... args) throws CloneNotSupportedException, IOException {
        var names = new String[] {"kamar", "baraka", "kombe"};
        Arrays.sort(names, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(names));

        /*Scanner in = new Scanner(Path.of("C:\\Users\\kamar\\Downloads\\Notion Backup Codes.txt"),
            StandardCharsets.UTF_8);

        Timer timer = new Timer(100, event -> {
            try{
                System.out.println(in.nextLine());
            }catch (NoSuchElementException e) {
                System.out.println("thank you");
                System.exit(0);
            }
        });
        timer.start();

        JOptionPane.showMessageDialog(null, "stop?");
        System.exit(0);*/
        BiFunction<String, Integer, String> tst = "my name is %s i'm %d \n"::formatted;//method refrence

        System.out.println(tst.apply("kamar", 23));

        ActionListener lst = event -> {
            System.out.println("kamar");
            Toolkit.getDefaultToolkit().beep();
        };

        new Timer(500, lst).start();
        JOptionPane.showConfirmDialog(null, "do you want to quit?");
        System.exit(12);

        /*ActionListener listener = event -> {System.out.println("hello");};
        new Timer(1000, listener).start();
        JOptionPane.showMessageDialog(null, "quit?");
        System.exit(0);*/
    }

    @Override
    public String bananas() {
        return Clonablee.super.bananas();
    }

    @Override
    public int kamar() {
        return 0;
    }
}
