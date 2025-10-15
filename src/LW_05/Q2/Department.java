package LW_05.Q2;

import java.util.ArrayList;

public class Department {
    private String name;
    private Lecturer departmentHead;

    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;

    public Department(String name, ArrayList<Lecturer> lecturersBelongsTo, ArrayList<Course> coursesOffering, Lecturer departmentHead) {
        this.name = name;
        this.lecturersBelongsTo = lecturersBelongsTo;
        this.coursesOffering = coursesOffering;
        this.departmentHead = departmentHead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appointDepartmentHead(Lecturer head) {
        this.departmentHead = head;
    }

    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) {
            System.out.println("Department Head: " + departmentHead.getName());
        } else {
            System.out.println("No department head assigned yet.");
        }
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
//        System.out.println(course.getName() + " has been added to the department offerings.");
    }

    public void withdrawCourse(Course course) {
        if (course != null && coursesOffering.contains(course)) {
            coursesOffering.remove(course);
            System.out.println(course.getName() + " has been removed from the department offerings.");
        } else {
            System.out.println("Course not found in department offerings.");
        }
    }

    public void addLecturer(Lecturer lecturer) {
        if (lecturer != null) {
            lecturersBelongsTo.add(lecturer);
//            System.out.println(lecturer.getName() + " has been added to the department.");
        } else {
            System.out.println("Cannot add a null lecturer.");
        }
    }

    public void removeLecturer(Lecturer lecturer) {
        if (lecturer != null && lecturersBelongsTo.contains(lecturer)) {
            lecturersBelongsTo.remove(lecturer);
            System.out.println(lecturer.getName() + " has been removed from the department.");
        } else {
            System.out.println("Lecturer not found in the department.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        if (departmentHead != null) {
            System.out.println("Department Head: " + departmentHead.getName());
        } else {
            System.out.println("Department Head: None");
        }
        System.out.println("Course Offering: ");
        for (Course course : coursesOffering) {
            System.out.println(course.getName());
        }
        System.out.println("Lecture Belongs To: ");
        for (Lecturer lecturer : lecturersBelongsTo) {
            System.out.println(lecturer.getName());
        }

    }
}
