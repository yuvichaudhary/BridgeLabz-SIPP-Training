package Oops.ObjectAndClass;

class Employee {
    String name;
    int id;
    double salary;
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Nisha";
        emp.id = 101;
        emp.salary = 50000;
        emp.displayDetails();
    }
}



