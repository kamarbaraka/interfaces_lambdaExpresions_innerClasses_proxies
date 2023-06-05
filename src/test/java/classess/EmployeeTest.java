/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package classess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee kamar = new Employee("kamar baraka", 250000);
    @BeforeEach
    void setUp() {
        var ngari = new Employee("ngari kombe", 50000);
    }

    @Test
    void bananas() {
        System.out.println(kamar.bananas());
    }

    @Test
    void setSalary() {
        kamar.setSalary(250);
        System.out.println(kamar.getSalary());
    }

    @Test
    void raiseSalary() {
        kamar.raiseSalary(5);
        System.out.println(kamar.getSalary());
    }

    @Test
    void getSalary() {
        System.out.println(kamar.getSalary());
    }

    @Test
    void getHireDay() {
        System.out.println(kamar.getHireDay());
    }

    @Test
    void getName() {
        System.out.println(kamar.getName());
    }

    @Test
    void getId() {
        System.out.println(kamar.getId());
    }

    @Test
    void testEquals() {
        assert kamar.equals(kamar);
    }

    @Test
    void testToString() {
    }

    @Test
    void testClone() throws CloneNotSupportedException{
    }

    @Test
    void compareTo() {
    }
}