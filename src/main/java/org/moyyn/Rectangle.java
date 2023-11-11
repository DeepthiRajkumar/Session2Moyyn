package org.moyyn;

public class Rectangle extends Shape implements Drawable {

    int l = 2;
    int w = 4;

    @Override
    public void area() {
        System.out.println(l);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
