package Constructor;
public class Course {
    private static String instituteName = "Default Institute";
    private String courseName;
    private int duration;
    private double fee;

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
    }
    public static void updateInstituteName(String name) {
        instituteName = name;
    }
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 6, 15000);
        Course course2 = new Course("Web Development", 4, 12000);

        course1.displayCourseDetails();
        course2.displayCourseDetails();

        Course.updateInstituteName("GLA UNIVERSITY");

        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}