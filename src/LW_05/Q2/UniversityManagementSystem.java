package LW_05.Q2;

import java.util.ArrayList;

public class UniversityManagementSystem {
    public static void main(String[] args) {

        ArrayList<Lecturer> seLecturers = new ArrayList<>();
        ArrayList<Course> seCourses = new ArrayList<>();

        ArrayList<Lecturer> cseLecturers = new ArrayList<>();
        ArrayList<Course> cseCourses = new ArrayList<>();

        ArrayList<Lecturer> acLecturers = new ArrayList<>();
        ArrayList<Course> acCourses = new ArrayList<>();

        Department department1 = new Department("Software Engineering", seLecturers, seCourses, null);
        Department department2 = new Department("Computer System Engineering", cseLecturers, cseCourses, null);
        Department department3 = new Department("Applied Computing", acLecturers, acCourses, null);


        ArrayList<Course> csCourses = new ArrayList<>();
        ArrayList<Course> etCourses = new ArrayList<>();
        ArrayList<Course> itCourses = new ArrayList<>();

        Degree degree1 = new Degree("Computer Science", 70, csCourses);
        Degree degree2 = new Degree("Engineering Technology", 100, etCourses);
        Degree degree3 = new Degree("Information Technology", 100, itCourses);

        Course course1 = new Course("Object-Oriented Programming", "Compulsory", 0, null, degree1);
        Course course2 = new Course("Software Engineering-1", "Compulsory", 0, null, degree1);
        Course course3 = new Course("Data Communication & Networking", "Compulsory", 0, null, degree1);

        degree1.offerCourse(course1);
        degree1.offerCourse(course2);
        degree2.offerCourse(course3);


        ArrayList<Course> lecturer1Courses = new ArrayList<>();
        ArrayList<Course> lecturer2Courses = new ArrayList<>();
        ArrayList<Course> lecturer3Courses = new ArrayList<>();

        Lecturer lecturer1 = new Lecturer("Mr.Perera", "Senior Lecturer", department1, lecturer1Courses);
        Lecturer lecturer2 = new Lecturer("Mr.John", "Lecturer", department2, lecturer2Courses);
        Lecturer lecturer3 = new Lecturer("Mr.Kumar", "Assistant Lecturer", department3, lecturer3Courses);

        department1.addLecturer(lecturer1);
        department2.addLecturer(lecturer2);
        department3.addLecturer(lecturer3);


        department1.appointDepartmentHead(lecturer1);
        department2.appointDepartmentHead(lecturer2);
        department3.appointDepartmentHead(lecturer3);

        ArrayList<Course> student1Courses = new ArrayList<>();
        ArrayList<Course> student2Courses = new ArrayList<>();
        ArrayList<Course> student3Courses = new ArrayList<>();

        Student student1 = new Student("Amal", "S001", "1", degree1, student1Courses);
        Student student2 = new Student("Kamal", "S002", "1", degree2, student2Courses);
        Student student3 = new Student("Nimal", "S003", "2", degree3, student3Courses);

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course3);

        System.out.println();

        lecturer1.addCourse(course1);
        lecturer1.addCourse(course2);
        lecturer2.addCourse(course3);

        department1.displayInfo();
        department2.displayInfo();
        department3.displayInfo();

        System.out.println("Lecturers' Teaching Lists");
        lecturer1.listCoursesTeaching();
        lecturer2.listCoursesTeaching();
        lecturer3.listCoursesTeaching();


        System.out.println("Students' Enrolled Courses");
        student1.listCoursesEnrolled();
        student2.listCoursesEnrolled();
        student3.listCoursesEnrolled();
    }
}
