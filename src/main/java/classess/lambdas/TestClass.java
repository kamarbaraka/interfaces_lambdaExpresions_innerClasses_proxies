/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package classess.lambdas;

import org.bouncycastle.asn1.x509.sigi.PersonalData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
    private String name;

    public TestClass(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static void main(String... args){
        /*var input = new Scanner(System.in);
        var kamar = input.nextLine().strip().transform(TestClass::new);
        System.out.println(kamar.getName());*/

        var people = new ArrayList<String>();
        people.add("kamar");
        people.add("baraka");

    }
}
