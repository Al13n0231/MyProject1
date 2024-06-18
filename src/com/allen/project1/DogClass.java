package com.allen.project1;

public class DogClass {
    private String name;

    public DogClass(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " says: Woof!");
    }
}
