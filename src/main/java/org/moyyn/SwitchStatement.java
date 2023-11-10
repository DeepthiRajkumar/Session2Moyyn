package org.moyyn;

import java.util.Scanner;

public class SwitchStatement {

    public void checkshape(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check the type of shape:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected a Circle.");
                break;
            case 2:
                System.out.println("You selected a Square.");
                break;
            case 3:
                System.out.println("You selected a Triangle.");
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }
    }
}
