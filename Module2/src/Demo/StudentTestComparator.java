package demo;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTestComparator {
    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();

        listStudent.add(new Student("Chuong", 32, "female", "20/04/1988"));
        listStudent.add(new Student("Quang", 22, "female", "25/04/1988"));
        listStudent.add(new Student("Hien", 30, "male", "25/04/1988"));
        listStudent.add(new Student("Phuong", 28, "female", "20/04/1988"));
        listStudent.add(new Student("Phuong", 32, "male", "12/04/1988"));
        listStudent.add(new Student("Phuong", 24, "male", "18/04/1998"));
        listStudent.add(new Student("Khanh", 35, "male", "15/04/1998"));
        listStudent.add(new Student("Nguyen", 27, "female", "10/04/1992"));
        listStudent.add(new Student("Tung", 24, "male", "20/03/1982"));
        listStudent.add(new Student("Tung", 26, "male", "01/07/1978"));
        listStudent.add(new Student("Phuong", 34, "female", "20/08/1984"));
        listStudent.add(new Student("Khanh", 24, "male", "12/05/1978"));
        listStudent.add(new Student("Chuong", 24, "female", "10/04/1998"));

        ComparatorSortByAge sortAge = new ComparatorSortByAge();
        Collections.sort(listStudent, sortAge);

        System.out.println("Sort by Age:");
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(listStudent.get(i));
        }
        System.out.println();

        System.out.println("Sort by Name:");
        ComparatorSortByName sortName = new ComparatorSortByName();
        Collections.sort(listStudent, sortName);
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(listStudent.get(i));
        }

    }
}
