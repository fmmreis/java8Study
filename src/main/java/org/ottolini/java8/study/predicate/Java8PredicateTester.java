package org.ottolini.java8.study.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8PredicateTester {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        eval(list, n -> true);

        System.out.println("--------------------------------");
        eval(list, n -> n > 5 && n < 8);

        System.out.println("--------------------------------");
        eval(list, n -> n%2 == 0);
    }


     private static void eval(List<Integer> list, Predicate<Integer> predicate){
        for(Integer i : list) {
            if(predicate.test(i))
                System.out.println(i);
        }
    }
}
