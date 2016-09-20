package com.company;

/**
 * Created by stevenburris on 9/20/16.
 */
public class Mammal extends Animal {
    Mammal() {
        this.name = "Mammal";
    }

    @Override
    void makeSound() {
        System.out.println("Mammal sound!!!!");
    }
}
