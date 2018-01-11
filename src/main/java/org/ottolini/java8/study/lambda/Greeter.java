package org.ottolini.java8.study.lambda;
//lambdas:
//enable functional programming
//enable readable and concise code
//enable support for parallel processing (multicore processors)
//why do we need functional programming?
//passing behaviour in OOP using an interface implementation

public class Greeter {

    public interface Greeting {
        public void perform();
    }

    private void greet(Greeting greeting){

       greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        greeter.greet(new Greeting() {
            @Override
            public void perform() {
                System.out.println("Greeting from from interface");
            }
        });

        greeter.greet(()-> System.out.println("Greeting from from lambda"));
    }


}
