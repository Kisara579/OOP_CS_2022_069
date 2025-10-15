package LW_05.Q2;

import java.util.ArrayList;

public class Lecturer extends Person {
    private String position;

    private Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position, Department department, ArrayList<Course> coursesTeaching) {
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = coursesTeaching;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayDepartmentInfo() {
        System.out.println("Department Information");
        department.displayInfo();
    }

    public void addCourse(Course course) {
        if (course != null) {
            coursesTeaching.add(course);
//            System.out.println(course.getName() + " has been added to " + getName() + "'s teaching list.");
        }
    }

    public void removeCourse(Course course) {
        if (course != null && coursesTeaching.contains(course)) {
            coursesTeaching.remove(course);
            System.out.println(course.getName() + " has been removed from " + getName() + "'s teaching list.");
        } else {
            System.out.println("Course not found in " + getName() + "'s teaching list.");
        }
    }

    public void listCoursesTeaching() {
        System.out.println(getName() + " is teaching the following courses:");
        if (coursesTeaching.isEmpty()) {
            System.out.println("No courses assigned yet.");
        } else {
            for (Course course : coursesTeaching) {
                System.out.println("- " + course.getName());
            }
        }

    }

    @Override
    public void displayInfo() {
        System.out.println("Lecture Name: " + getName());
        System.out.println("Position: " + position);
        if (department != null) {
            System.out.println("Department: " + department.getName());
        } else {
            System.out.println("Department: None");
        }
        System.out.println("Course Teaching: ");
        listCoursesTeaching();
    }
}
