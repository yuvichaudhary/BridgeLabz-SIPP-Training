package Inheritence;

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Chef extends Person implements Worker {
    String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println("Cooking delicious " + specialty + " dishes.");
    }
}

class Waiter extends Person implements Worker {
    int tableCount;

    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    public void performDuties() {
        System.out.println("Serving customers at " + tableCount + " tables.");
    }
}

public class RestrauntTest {
    public static void main(String[] args) {
        Worker chef = new Chef("Raj", 201, "Italian");
        Worker waiter = new Waiter("Priya", 301, 5);

        chef.performDuties();
        waiter.performDuties();
    }
}