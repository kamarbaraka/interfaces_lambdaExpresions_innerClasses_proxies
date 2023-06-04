package classess;

import interfaces.Clonablee;
import interfaces.Comparablee;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 * a simple class to demonstrate interfaces
 * */
public class Employee
        implements Comparable<Employee>, Clonablee<Employee> {
    private int nextInt = new Random().nextInt(10000);
    private String name;
    private final int id;

    {
        name = "";
        id = nextInt;
    }

    public Employee(String name){
        this.name = name;
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
    public int compareTo(Employee otherEmployee)
            throws ClassCastException{
        if (this.getClass() != otherEmployee.getClass())
            throw new ClassCastException();
        return Integer.compare(this.getId(), otherEmployee.getId());
    }

    public static void main(String... args){
        var kamar = new Employee("kamar");
        var baraka = new Employee("baraka");

        System.out.println(kamar.compareTo(baraka));
        System.out.printf("%s %s\n", kamar.getId(), baraka.getId());
        var arr = new Employee[] {kamar, baraka};
        for (Employee each : arr)
            System.out.printf("%s ", each.getName());
        System.out.println();
        Arrays.sort(arr);
        for (Employee each : arr)
            System.out.printf("%s ", each.getName());
    }

    /*@Override
    public Employee clone(Employee other) {
        return ;
    }*/
}
