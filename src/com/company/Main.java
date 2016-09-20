package com.company;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();
        Hawk h = new Hawk();
        Snake s = new Snake();

        d.makeSound();
        h.makeSound();
        s.makeSound();

        System.out.println(d);
        System.out.println(h);
        System.out.println(s);


    }
}
