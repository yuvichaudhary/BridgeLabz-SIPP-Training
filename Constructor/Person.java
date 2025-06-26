package Constructor;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    public static void main(String[] args) {
        Person original = new Person("yuvi", 21);
        Person copy = new Person(original);

        System.out.println("Original Person : Name: " + original.name + ", Age: " + original.age);
        System.out.println("Copied Person   : Name: " + copy.name + ", Age: " + copy.age);
    }
}