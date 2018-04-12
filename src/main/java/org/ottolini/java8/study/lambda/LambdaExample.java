package org.ottolini.java8.study.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {

        //Default Methods for Interfaces
        //formula implemented as an anonymous object, is quite verbose
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println("A raiz é " + formula.calculate(4));


        //Lambda expressions
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        //java 7 way is using an anonymous Comparator implementation
        Collections.sort(names, new Comparator<String>() {  //the Collections.sort accepts a list and a comparator
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println("Sorted with a comparator: " + names);

        //java 8 way is using a lambda expression
        //each lambda corresponds to a given type, specified by an interface
        //A so called functional interface must contain exactly one abstract method declaration
        Collections.sort(names, (a,b) -> b.compareTo(a)); //sorting using Collections and a lambda expression
        System.out.println("Sorted with a lambda expression: " + names);


        Converter<String, Integer> converter = (f -> Integer.valueOf(f));
        Integer converted1 = converter.convert("123");
        System.out.println(converted1);

        Converter<Integer, String> converter2 = (f -> String.valueOf(f));
        String converted2 = converter2.convert(321);
        System.out.println(converted2);

        Converter<String, Integer> converter3 =  Integer::valueOf;
        Integer converted3 = converter3.convert("456");
        System.out.println(converted3);

        Converter<Integer, String> converter4 = String::valueOf;
        String converted4 = converter4.convert(456);
        System.out.println(converted4);
    }


    @FunctionalInterface            //functional interface allows only one abstract method
    private interface Formula{
        double calculate(int a);
        default double sqrt(int a){ //default method
            return Math.sqrt(a);
        }
    }

    @FunctionalInterface            //functional interface allows only one abstract method
    private interface Converter<F, T> {  //generified interface
        T convert(F from);
    }
}
