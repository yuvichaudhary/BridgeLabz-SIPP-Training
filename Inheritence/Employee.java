package Inheritence;
    class Employees {
        String name;
        int id;
        double salary;

        Employees(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        void displayDetails() {
            System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
        }
    }

    class Manager extends Employees {
        int teamSize;

        Manager(String name, int id, double salary, int teamSize) {
            super(name, id, salary);
            this.teamSize = teamSize;
        }

        void displayDetails() {
            super.displayDetails();
            System.out.println("Team Size: " + teamSize);
        }
    }

    class Developer extends Employees {
        String programmingLanguage;

        Developer(String name, int id, double salary, String programmingLanguage) {
            super(name, id, salary);
            this.programmingLanguage = programmingLanguage;
        }

        void displayDetails() {
            super.displayDetails();
            System.out.println("Programming Language: " + programmingLanguage);
        }
    }

    class Intern extends Employees {
        String mentor;

        Intern(String name, int id, double salary, String mentor) {
            super(name, id, salary);
            this.mentor = mentor;
        }

        void displayDetails() {
            super.displayDetails();
            System.out.println("Mentor: " + mentor);
        }
    }

    public class Employee {
        public static void main(String[] args) {
            Employees[] employees = {
                    new Manager("A", 1001, 80000, 5),
                    new Developer("B", 1002, 60000, "Java"),
                    new Intern("C", 1003, 20000, "A")
            };

            for (Employees emp : employees) {
                emp.displayDetails();
                System.out.println("--------------------");
            }
        }
    }

