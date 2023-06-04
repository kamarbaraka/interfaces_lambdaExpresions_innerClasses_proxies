/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package classess;

import interfaces.Comparatorr;

import java.util.Arrays;
import java.util.Comparator;

public class LengthComparator
        implements Comparatorr<String> {
    @Override
    public int compare(String one, String two) {
        return one.length() - two.length();
    }

    public static void main(String... args){
        var comp = new  LengthComparator();
        var list = new String[] {"kamar", "baraka", "ngari"};
    }
}
