package LW_05.Q2;

import java.util.ArrayList;

public class Degree {
    private String name;
    private int numberOfStudents;

    private ArrayList<Course> coursesOffering;

    public Degree(String name, int numberOfStudents, ArrayList<Course> coursesOffering) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = coursesOffering;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void offerCourse(Course course) {
        if (course != null && !coursesOffering.contains(course)) {
            coursesOffering.add(course);
//            System.out.println(course.getName() + " is now offered in the degree: " + name);
        }
    }

    public void withdrawCourse(Course course) {
        if (course != null && coursesOffering.contains(course)) {
            coursesOffering.remove(course);
            System.out.println(course.getName() + " has been withdrawn from the degree: " + name);
        } else {
            System.out.println("Course not found in the degree offerings.");
        }
    }

    public void listCoursesOffering() {
        System.out.println("Degree " + name + " offers the following courses:");
        if (coursesOffering.isEmpty()) {
            System.out.println("No courses offered yet.");
        } else {
            for (Course course : coursesOffering) {
                System.out.println("- " + course.getName());
            }
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Number Of Students: " + numberOfStudents);
        System.out.println("Courses Offering:");
        for (Course course : coursesOffering) {
            System.out.println(course.getName());
        }

    }
}
