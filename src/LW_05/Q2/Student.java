package LW_05.Q2;

import java.util.ArrayList;

public class Student extends Person {
    private String studentID;
    private String year;

    private Degree degree;

    private ArrayList<Course> coursesEnrolled;

    public Student(String name, String studentID, String year, Degree degree, ArrayList<Course> coursesEnrolled) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
        this.coursesEnrolled = coursesEnrolled;
    }


    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void registerDegree(Degree degree) {
        if (degree != null) {
            this.degree = degree;
        }
    }

    public void displayDegreeInfo() {
        if (degree != null) {
            System.out.println(getName() + "'s Degree Information:");
            degree.displayInfo();
        } else {
            System.out.println(getName() + " has not registered for any degree yet.");
        }
    }

    public void enrollCourse(Course course) {
        if (course != null && !coursesEnrolled.contains(course)) {
            coursesEnrolled.add(course);
            System.out.println(getName() + " has enrolled in: " + course.getName());
        }
    }

    public void unenrollCourse(Course course) {
        if (course != null && coursesEnrolled.contains(course)) {
            coursesEnrolled.remove(course);
            System.out.println(getName() + " has unenrolled from: " + course.getName());
        } else {
            System.out.println(course.getName() + " is not in " + getName() + "'s enrolled courses.");
        }
    }

    public void listCoursesEnrolled() {
        System.out.println(getName() + " is enrolled in the following courses:");
        if (coursesEnrolled.isEmpty()) {
            System.out.println("No courses enrolled yet.");
        } else {
            for (Course course : coursesEnrolled) {
                System.out.println("- " + course.getName());
            }
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
        System.out.println("Degree: " + degree);
        for (Course course : coursesEnrolled) {
            System.out.println("Course Enrolled: " + course.getName());
        }

    }
}
