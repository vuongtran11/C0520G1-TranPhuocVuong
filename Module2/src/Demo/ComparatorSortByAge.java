package demo;

import java.util.Comparator;

public class ComparatorSortByAge implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }
}
