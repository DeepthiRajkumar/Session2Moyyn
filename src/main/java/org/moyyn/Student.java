package org.moyyn;

public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String lastName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >=0 && age <= 70){
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    private int age;


}
