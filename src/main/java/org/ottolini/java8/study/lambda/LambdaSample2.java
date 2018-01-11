package org.ottolini.java8.study.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaSample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        numbers.forEach((value)-> System.out.println(value));
//        System.out.println("--------------------------------");
//        numbers.forEach(System.out::println);
//        System.out.println("--------------------------------");

//        Integer res = numbers.stream()
//                .map(e -> e * 2)
//                .reduce(0, (c, p)-> c + p);
//
//        System.out.println(res);
    }
}
