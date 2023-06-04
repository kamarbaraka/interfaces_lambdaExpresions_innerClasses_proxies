package classess.subs;

import classess.Employee;
import interfaces.Clonablee;


import javax.print.DocFlavor;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Manager
        extends Employee {
    private double salary;
    private double bonus;

    {
        salary = 0;
        bonus = 0;
    }

    public Manager(String name, double salary){
        super(name);
        this.salary = salary;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
        this.salary += bonus;
    }
    public double getSalary(){
        return this.salary;
    }
    public double getBonus(){
        return this.bonus;
    }
    public static void main(String... args) {
        var ngari = new Manager("Ngari", 2500);
        var baraka = new Employee("Baraka");
        var kah = new Employee("Ngari");
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
