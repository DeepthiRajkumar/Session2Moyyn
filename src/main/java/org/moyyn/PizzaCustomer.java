package org.moyyn;

public class PizzaCustomer {

    private PizzaProvider pizzaProvider;

    public PizzaCustomer(PizzaProvider pizzaProvider){
        this.pizzaProvider = pizzaProvider;
    }

    public void orderAndEnjoyPizza(){
        Pizza pizza = pizzaProvider.deliverPizza();
        pizza.eat();
    }
}
