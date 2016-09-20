package com.company;

/**
 * Created by stevenburris on 9/20/16.
 */
public class Snake extends Reptile {
    Snake () {
        this.name = "Snake";
    }

    @Override
    void makeSound(){
        System.out.println("Ssssssss");
    }
}
