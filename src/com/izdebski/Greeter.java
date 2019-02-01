package com.izdebski;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting lambdaGreeting = () ->System.out.println("Leclerc MBT");

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello world");
            }
        };

        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);
    }
}