package org.example;

import java.util.Comparator;
class SortbyGpa implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if (b.getGpa() - a.getGpa() < 0) {
            return -1;
        } else if (b.getGpa() - a.getGpa() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
