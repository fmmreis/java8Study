package org.ottolini.java8.study.lambda;

public class Java8LambdaTester {

    public static void main(String[] args) {
        Java8LambdaTester java8Tester = new Java8LambdaTester();

        MathOperation addition = (a,b)-> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation division = (a, b)-> a / b;
        MathOperation product = (a, b)-> a * b;

        System.out.println(java8Tester.operate(10, 5, addition));
        System.out.println(java8Tester.operate(10, 5, subtraction));
        System.out.println(java8Tester.operate(10, 5, division));
        System.out.println(java8Tester.operate(10, 5, product));
    }

    interface MathOperation {
        public int calculate(int a, int b);
    }

    int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.calculate(a, b);
    }
}
