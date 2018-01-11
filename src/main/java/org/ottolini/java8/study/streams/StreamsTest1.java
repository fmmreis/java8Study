package org.ottolini.java8.study.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsTest1 {

    public static void main(String[] args) {
        streamFilter();
        System.out.println("-------------------------------");
        streamForEach();

    }

    private static void streamFilter(){
        List<String> strings = Arrays.asList("abc","", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.parallelStream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        filtered.stream().forEach(System.out::println);
    }

    private static void streamForEach(){
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}
