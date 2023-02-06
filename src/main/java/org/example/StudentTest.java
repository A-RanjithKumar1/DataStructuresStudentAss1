package org.example;
import java.util.Scanner;
import java.util.logging.*;
public class Student {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    private String name;
    private int age;
    private float gpa;
    static String s;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getDetails() {
        s = "Below are the Student details:-" + "\n" + "Name:- " + name + "\n" + "Age:- " + age + "\n" + "GPA:- " + gpa;
        return s;
    }

    // Setter
    public void setgpa(float c) {
        this.gpa = c;
        s = "The" + gpa + " GPA for the Student has been Registered";
        LOGGER.info(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LOGGER.info( "Please Enter the Student Name");
        String name = sc.next();
        LOGGER.info( "Enter the Age");
        int age = sc.nextInt();
        Student Details = new Student(name, age);
        boolean choose = true;
        while (choose) {
            LOGGER.info("Select the below Operations" + "\n" + "1.Set the Student GPA" + "\n" + "2.Get the Student Details" + "\n" + "3.Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                LOGGER.info("Enter your GPA");
                float gp = sc.nextFloat();
                Details.setgpa(gp);
            } else if (ch == 2) {
                s = Details.getDetails();
                LOGGER.info(s);
                choose = false;
            } else if (ch == 3) {
                choose = false;
            } else {
                LOGGER.info( "Something Went Wrong");
            }
        }
    }
}