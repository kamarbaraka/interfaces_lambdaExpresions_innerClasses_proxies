/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package classess.lambdas;

import org.springframework.lang.NonNull;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;


public class Lambdas {
    public void repeat(@NonNull int count, String s, ObjIntConsumer<String> action){
        for (int i = 0; i < count; i++){
            action.accept(s, i);
        }
    }
    public void testT(String s, String t, BiPredicate<String, String> p){
        System.out.println(p.test(s, t));
    }
    public static void main(String... args){
        new Lambdas().repeat(5, "hello", (s, i) -> System.out.printf("%d %s\n", i, s));
        new Lambdas().testT("kamar", "kamar", String::equals);
    }
}
