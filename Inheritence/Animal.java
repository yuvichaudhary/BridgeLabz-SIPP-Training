package Inheritence;
 class Animals {
    String name;
    int age;

    Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animals {
    Dog(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animals {
    Cat(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Meow~");
    }
}

class Bird extends Animals {
    Bird(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Chirp chirp!");
    }
}
public class Animal {
    public static void main(String[] args) {
        Animals[] animals = {
                new Dog("Buddy", 3),
                new Cat("Whiskers", 2),
                new Bird("Tweety", 1)
        };

        for (Animals a : animals) {
            a.makeSound();
        }
    }
}