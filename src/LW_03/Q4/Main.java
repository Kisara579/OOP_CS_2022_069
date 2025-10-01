package LW_03.Q4;

public class Main {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("Kumar","CSCI 11023");
        Course course1 = new Course("Introduction to CS","CSCI 11023",lecturer1);
        Student student1 = new Student("Kamal","CS",course1.getCourseName());


        System.out.println("Course: " + course1.getCourseName() + " (" + course1.getCourseCode() + ")");
        System.out.println("Lecturer: " + course1.getLecturer().getLecturerName());
        System.out.println("Student: " + student1.getStudentName());
        System.out.println("Degree: " + student1.getDegreeName());
        System.out.println("Following Course: " + student1.getCourseFollowing());

    }
}
