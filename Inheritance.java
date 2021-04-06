package MoreOnClasses;

public class Inheritance {
    public void makeSound() {
        System.out.println("Hi");
    }
}

/**
 *
 */
class Dog {
        Dog() {
    }

    public void makeSound() {
    }
}
class A {
    public int x;

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}