package org.moyyn;

public class TernaryOperatorDemo {

    public void checkOddOrEven(){
        int number = 7;

        String result = (number % 2 == 0) ? "even" : "odd";

        System.out.println("The number is " + result + ".");

    }
}
