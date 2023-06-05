/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package classess.examples;

import interfaces.Comparablee;

public class Example {
    public static void main(String... args){
        new Example().add(5, 2, Integer::sum);
    }
    public void add(int one, int two, Comparablee<?> c){
        System.out.println(c.kamar(one, two));
    }
}
