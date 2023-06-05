/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package classess.subs;

import classess.Employee;
import interfaces.Clonablee;
import interfaces.Comparablee;


import javax.print.DocFlavor;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDate;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.spi.LocaleServiceProvider;
import java.util.stream.Stream;

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
    public Manager(String name){
        super(name);
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

        /*var test = new Manager("test subject", 657);
        try {
            var te = test.calculate(test , test.getName()::length);
            System.out.println(te);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        var lst = new ArrayList<Manager>(2);
        lst.add(ngari); lst.add(test);
        lst.forEach(System.out::println);

        Thread tr = new Thread(() -> {
            int i = 0;
            while (i < 10){
                System.out.println("hey");
                i++;
            }
        });
        tr.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> names = new ArrayList<>();
        names.add("samonte"); names.add("spaghetti"); names.add("toothpick");
        Stream<Manager> nameStream = names.stream().map(Manager::new);
        List<Manager> managers = nameStream.toList();
        managers.forEach(System.out::println);
        ArrayList<?> wilds = new ArrayList<>(names);
        wilds.forEach(System.out::println);*/
        //Stream<String> wildsStream = wilds.stream().filter((String s) -> s.length() < 7);
    }
    Exception ComparableeException = new Exception("comparable");
    public Integer calculate(Object o, Comparablee t)
            throws Exception {
        if (!(o instanceof Comparablee<?>)) throw ComparableeException;
        return t.kamar(1, 2);
    }
}
