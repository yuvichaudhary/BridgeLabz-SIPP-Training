package Oops.ObjectAndClass;

public class Student {
    String name;
    int rollNumber;
    int marks;

    Student(String name,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;

    }
    String CalculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B+";
        else if (marks >= 60) return "B";
        else if (marks >= 50) return "C+";
        else if (marks >= 40) return "C";
        else return "Fail";
    }
    void displayDetails() {
        System.out.println("Student Name: " +name);
        System.out.println("Student Roll Number: " +rollNumber);
        System.out.println("Student Marks: " +marks);
        System.out.println("Student Grade: " +CalculateGrade());
        }

        public static void main(String[] args) {
            Student student1 = new Student("Yuvi", 23, 82);
            student1.displayDetails();

        }
}
