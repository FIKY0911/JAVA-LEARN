package Hierarchical.Inheritance;

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Meowing...");
    }
}

class Cow extends Animal {
    public void moo() {
        System.out.println("Mooing...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        Cow cow = new Cow();
        cow.eat();
        cow.moo();
    }
}
