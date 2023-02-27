package org.example;
import java.util.List;
import java.util.logging.Logger;
class Student {
    private static final Logger logger = Logger.getLogger("InfoLogging");
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
            logger.info(st.getName() + ", " + st.getAge() + ", " + st.getGpa());
        }
    }
}
