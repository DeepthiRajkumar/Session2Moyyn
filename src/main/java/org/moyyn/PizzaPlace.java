package org.moyyn;

public class PizzaPlace implements PizzaProvider{

    private  String pizzaType;

    public void pizzaPlace(String pizzaType){
        this.pizzaType = pizzaType;
    }
    @Override
    public Pizza deliverPizza() {
        return new Pizza(pizzaType);
    }
}
