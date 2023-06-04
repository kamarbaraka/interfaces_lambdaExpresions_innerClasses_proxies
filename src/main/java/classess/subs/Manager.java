/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package classess.subs;

import classess.Employee;
import interfaces.Clonablee;


import javax.print.DocFlavor;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
import java.util.spi.LocaleServiceProvider;

public class Manager
        extends Employee {
    private double bonus;

    {
        bonus = 0;
    }

    public Manager(String name, double salary, LocalDate hireDay){
        super(name, salary, hireDay);
    }
    public Manager(String name, double salary){
        super(name, salary);
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
        this.setSalary(this.getSalary() + bonus);
    }

    public double getBonus(){
        return this.bonus;
    }
    public static void main(String... args) {
        var ngari = new Manager("Ngari", 2500);
        var baraka = new Employee("Baraka", 55464);
        var kah = new Employee("Ngari", 567);
        var path = Path.of("C:\\Users\\kamar\\Downloads\\Notion Backup Codes.txt");
        Scanner input;
        try {
            input = new Scanner(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int line : new int[5])
            System.out.println(input.nextLine());
        File file = new File("C:\\Users\\kamar\\Downloads\\test.txt");
        PrintStream str;
        FileReader reader;
        try {
            str = new PrintStream(file);
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(ngari.AUTHOR);
        try {
            var read = reader.read();
            System.out.println(read);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
