package org.ottolini.java8.study.lambda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LambdaSample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1 , 2, 3, 4, 5, 6);

//        Iterator iter = numbers.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }
//
//       for(int i = 0; i < numbers.size(); i++) {
//           System.out.println(numbers.get(i));
//       }
//
//        for(Integer i : numbers){
//            System.out.println(i);
//        }
//
//        numbers.stream().forEach((i)-> System.out.println(i));

        numbers.stream().forEach(System.out::println);

    }

}
