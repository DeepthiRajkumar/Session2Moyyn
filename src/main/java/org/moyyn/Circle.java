package org.moyyn;

import java.sql.SQLOutput;

public class Circle extends Shape implements Drawable, Sketch{

    double pi = 3.14;
    int r = 2;
    @Override
    public void area() {
        System.out.println(r);
        System.out.println("Calculated Area");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
