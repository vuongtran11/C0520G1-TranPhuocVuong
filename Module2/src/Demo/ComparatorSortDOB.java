package demo;

import java.util.Comparator;

public class ComparatorSortDOB implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int resultYear = compareYear(s1,s2);
        if(resultYear == 0){
            int resultMonth = compareMonth(s1, s2);
            if(resultMonth == 0){
                return compareDay(s1, s2);
            }
            return resultMonth;
        }
        return resultYear;
    }

    public int compareYear(Student s1, Student s2){
        int year1 = Integer.parseInt(s1.getDob().substring(6));
        int year2 = Integer.parseInt(s2.getDob().substring(6));
        return year1 - year2;
    }

    public int compareMonth(Student s1, Student s2){
        int month1 = Integer.parseInt(s1.getDob().substring(3, 5));
        int month2 = Integer.parseInt(s2.getDob().substring(3, 5));
        return month1 - month2;
    }
    public int compareDay(Student s1, Student s2){
        int day1 = Integer.parseInt(s1.getDob().substring(0, 2));
        int day2 = Integer.parseInt(s2.getDob().substring(0, 2));
        return day1 - day2;
    }
}
