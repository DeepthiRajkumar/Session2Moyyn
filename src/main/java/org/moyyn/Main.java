package org.moyyn;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Print numbers from 1-10
      for (int i = 1; i<=10;i++) {
            System.out.println(i);
        }

       int number = 1;
        while (number<=10) {
            System.out.println(number);
            number++;
        }

        int i =1 ;
        do {
            System.out.println(i);
            i++;
        } while(i<=10);
    }
}