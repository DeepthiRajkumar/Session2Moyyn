package org.moyyn;

public class Pizza {

    private String type;

    public Pizza(String type) {
        this.type = type;
    }

    public void eat(){
        System.out.println("Delicious" + type + "pizza is served. Enjoy!");
    }
}
