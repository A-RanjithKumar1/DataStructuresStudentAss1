package org.example;
import java.util.Scanner;
import java.util.logging.*;
import java.util.*;
class Student {
    private static final Logger LOGger = Logger.getLogger("InfoLogging");
    private String name;
    private int age;
    private float gpa;
    static String s;

    Student(String name, int age, float gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(float gpa) {
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

    public static void printDetails(List<Student> al) {
        for (Student st : al) {
            LOGger.info(st.getName() + ", " + st.getAge() + ", " + st.getGpa());
        }
    }
}
     class SortbyGpa implements Comparator<Student>
    {
        public int compare(Student a, Student b)
        {
            if (b.getGpa() - a.getGpa() < 0){
                return -1;
            }
            else if(b.getGpa() - a.getGpa() > 0){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    public class StudentTest {
        public static void main(String[] args) {
            final Logger LOG = Logger.getLogger("InfoLogging");
            Scanner sc = new Scanner(System.in);
            ArrayList<Student> al = new ArrayList<Student>();
            LOG.info("Enter the no of students details to be registered");
            int n = sc.nextInt();
            while (n > 0) {
                LOG.info("Please Enter the Student Name");
                String name = sc.next();
                LOG.info("Enter the Age");
                int age = sc.nextInt();
                LOG.info("Enter the Gpa");
                float gpa = sc.nextFloat();
                al.add(new Student(name, age, gpa));
                n -= 1;
            }
            int op =1;
            while (op>0 && op<=2) {
                LOG.info("Select the below Operations" + "\n" + "1.PrintDetails of each Student" + "\n" + "2.Sort the list by highest to lowest with respect to GPA and Display" + "\n" + "3.Exit");
                op = sc.nextInt();
                if (op == 1) {
                    Student.printDetails(al);
                } else if (op == 2) {
                    Collections.sort(al, new SortbyGpa());
                    LOG.info("After Sorting");
                    for (Student st : al) {
                        LOG.info(st.getName() + ", " + st.getAge() + ", " + st.getGpa());
                    }
                    op=10;
                }
                else{
                    op=10;
                }
            }
        }
        }