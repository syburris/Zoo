package com.company;

/**
 * Created by stevenburris on 9/20/16.
 */
public class Dog extends Mammal {
    Dog() {
        this.name = "Dog";
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Bark");
    }
}
