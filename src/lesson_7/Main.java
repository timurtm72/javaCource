package lesson_7;

import lesson_7.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal  = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.eat();
        dog.eat();
        cat.eat();
    }

}
