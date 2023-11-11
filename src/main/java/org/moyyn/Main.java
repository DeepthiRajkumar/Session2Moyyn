package org.moyyn;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.makesSound();
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        Penguin penguin = new Penguin();
        penguin.swim();
        penguin.makesSound();
        penguin.makesSound("penguin sound");


        // Dependency Injection
        PizzaProvider pizzaProvider = new PizzaPlace();

        PizzaCustomer pizzaCustomer  = new PizzaCustomer(pizzaProvider);

        pizzaCustomer.orderAndEnjoyPizza();
    }
}