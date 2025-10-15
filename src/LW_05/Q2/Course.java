package LW_05.Q2;

public class Course {
    private String name;
    private String enrollType;
    private int numberOfStudentsEnrolled;

    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, int numberOfStudentsEnrolled, Lecturer lecturerInCharge, Degree degreeBelongsTo) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
        this.lecturerInCharge = lecturerInCharge;
        this.degreeBelongsTo = degreeBelongsTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void addLecturerInCharge(Lecturer lecturer) {
        if (lecturer != null) {
            this.lecturerInCharge = lecturer;
//            System.out.println(lecturer.getName() + " is now in charge of " + name);
        }
    }

    public void removeLecturerInCharge() {
        if (lecturerInCharge != null) {
            System.out.println(lecturerInCharge.getName() + " removed from " + name);
            this.lecturerInCharge = null;
        }
    }

    public void addDegreeBelongsTo(Degree degree) {
        if (degree != null) {
            this.degreeBelongsTo = degree;
//            System.out.println(name + " now belongs to degree " + degree.getName());
        }
    }

    public void removeDegreeBelongsTo() {
        if (degreeBelongsTo != null) {
            System.out.println(name + " removed from degree " + degreeBelongsTo.getName());
            this.degreeBelongsTo = null;
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Enroll Type: " + enrollType);
        System.out.println("Number Of Students Enrolled: " + numberOfStudentsEnrolled);

        if (lecturerInCharge != null) {
            System.out.println("Lecturer In Charge: " + lecturerInCharge.getName());
        } else {
            System.out.println("Lecturer In Charge: None");
        }

        if (degreeBelongsTo != null) {
            System.out.println("Degree Belongs To: " + degreeBelongsTo.getName());
        } else {
            System.out.println("Degree Belongs To: None");
        }

    }
}
