package org.example;
import java.util.Scanner;
import java.util.logging.*;
import java.util.*;
class Student {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    private String name;
    private int age;
    private float gpa;
    static String s;

    Student(String name, int age, float gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setGpa(float gpa){
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getGpa() {
        return gpa;
    }

    public static void printDetails(ArrayList<Student> al) {
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            s = ("Name:- " + st.getName() + " Age:- " + st.getAge() + " GPA:- " + st.getGpa());
            LOGGER.info(s);
        }
    }
    static class SortbyGpa implements Comparator<Student>
    {
        public int compare(Student a, Student b)
        {
            return (int) (b.gpa - a.gpa);
        }
    }
            }
    public class StudentTest {
        public static void main(String[] args) {
            String s;
            final Logger LOGGER = Logger.getLogger("InfoLogging");
            Scanner sc = new Scanner(System.in);
            Student s3 = new Student("Zombi", 25, 8);
            Student s4 = new Student("Nexa", 21, 7);
            Student s5 = new Student("Rock", 25, 6);
            Student s1 = new Student("ranjith", 23, 10);
            Student s2 = new Student("Ravi", 21, 9);
            ArrayList<Student> al = new ArrayList<Student>();
            al.add(s3);
            al.add(s4);
            al.add(s5);
            al.add(s1);
            al.add(s2);
            LOGGER.info("Select the below Operations" + "\n" + "1.PrintDetails of each Student" + "\n" + "2.Sort the list by highest to lowest with respect to GPA and Display" + "\n" + "3.Exit");
            int op = sc.nextInt();
                if (op == 1) {
                    Student.printDetails(al);
                } else if (op == 2) {
                    Collections.sort(al, new Student.SortbyGpa());
                    LOGGER.info("After Sorting");
                    for (Student st : al) {
                        LOGGER.info(st.getName() + ", " + st.getAge() + ", " + st.getGpa());
                    }
                } else {
                    LOGGER.info("Something went Wrong");
                }
            }
        }