package Oops.ObjectAndClass;
public class AreaOfCircle {
    double radius;
    double area() {
        return Math.PI * radius * radius;
    }
    double circumference() {
        return 2 * Math.PI * radius;
    }
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }
    public static void main(String[] args) {
        AreaOfCircle c = new AreaOfCircle();
        c.radius = 7.0;
        c.display();
    }
}
