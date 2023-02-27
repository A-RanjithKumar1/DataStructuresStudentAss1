package org.example;
import java.util.Scanner;
import java.util.logging.*;
import java.util.*;

public class StudentTest {
        public static void main(String[] args) {
            final Logger log = Logger.getLogger("InfoLogging");
            Scanner sc = new Scanner(System.in);
            ArrayList<Student> al = new ArrayList<Student>();
            log.info("Enter the no of students details to be registered");
            int n = sc.nextInt();
            while (n > 0) {
                log.info("Please Enter the Student Name");
                String name = sc.next();
                log.info("Enter the Age");
                int age = sc.nextInt();
                log.info("Enter the Gpa");
                float gpa = sc.nextFloat();
                al.add(new Student(name, age, gpa));
                n -= 1;
            }
            int op =1;
            while (op>0 && op<=2) {
                log.info("Select the below Operations" + "\n" + "1.PrintDetails of each Student" + "\n" + "2.Sort the list by highest to lowest with respect to GPA and Display" + "\n" + "3.Exit");
                op = sc.nextInt();
                if (op == 1) {
                    Student.printDetails(al);
                } else if (op == 2) {
                    Collections.sort(al, new SortbyGpa());
                    log.info("After Sorting");
                    for (Student st : al) {
                        log.info(st.getName() + ", " + st.getAge() + ", " + st.getGpa());
                    }
                    op=10;
                }
                else{
                    op=10;
                }
            }
        }
        }