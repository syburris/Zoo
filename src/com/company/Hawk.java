package com.company;

/**
 * Created by stevenburris on 9/20/16.
 */
public class Hawk extends Bird {
    Hawk () {
        this.name = "Hawk";
    }

    @Override
    void makeSound() {
        System.out.println("Caaawwwww");
    }
}
