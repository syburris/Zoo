package com.company;

/**
 * Created by stevenburris on 9/20/16.
 */
public class Animal {
    String name;

    void makeSound() {
        System.out.println("Generic animal sound.");
    }

    @Override
    public String toString() {
        return name;
    }
}
