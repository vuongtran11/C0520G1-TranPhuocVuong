package demo;

import java.util.Date;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String dob;

    public Student(String name, int age, String gender, String dob) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "age = " + age +
                "  name = '" + name + '\'' +
                "  gender = " + gender;
    }
}

