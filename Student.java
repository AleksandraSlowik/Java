package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String ID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;
    //constructor: users name and year
    public Student()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 Freshman\n2 Sophmore\n3 Junior\n4 Senior\n Enter student grade year: ");
        this.gradeYear = in.nextLine();
        System.out.println(firstName + " " + lastName + " " + gradeYear);

        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + ID);

    }

    //id
    private void setStudentID()
    {
        id++;
        this.ID = gradeYear + "" + id;

    }

    //enroll in courses
    public void enroll()
    {
        do {
            System.out.println("Enter course: ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                System.out.println("break");
                break;
            }
        } while(1 != 0);

        System.out.println("enrolled in: " + courses);
        System.out.println("tuition: " + tuitionBalance);
    }

    //view balance
    public void viewBalance()
    {
        System.out.println("your balance: "+ tuitionBalance);
    }
    public void payTuition()

    {
        viewBalance();
        System.out.println("Enter your payment:");
        Scanner in  = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thanks for payment:" + payment);
        viewBalance();
    }

    //show status
    public String showInfo()
    {
        return "Name:" + firstName + " " + lastName +
                "\nGrade level:" + gradeYear + " " + "\nStudent id:" + ID + " " +
                "\nCourses " + courses + "\nBalance: " + tuitionBalance;
    }

}
