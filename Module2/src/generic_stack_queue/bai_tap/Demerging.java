package generic_stack_queue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    public static class Student{
        private String name;
        private String birth;
        private String gender;
        public Student() {
        }
        public Student(String name, String birth, String gender) {
            this.name = name;
            this.birth = birth;
            this.gender = gender;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getBirth() {
            return birth;
        }
        public void setBirth(String birth) {
            this.birth = birth;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", birth='" + birth + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        Student[] student=new Student[10];
        Student student1 = new Student("huy", "1990", "nam");
        Student student2 = new Student("hung", "1990", "nam");
        Student student3 = new Student("viet", "1990", "nam");
        Student student4 = new Student("ha", "1991", "nữ");
        Student student5 = new Student("thuy", "1992", "nữ");
        Student student6 = new Student("phuong", "1993", "nữ");
        student[0]=student1;
        student[1]=student2;
        student[2]=student3;
        student[3]=student4;
        student[4]=student5;
        student[5]=student6;
//        System.out.println(Arrays.toString(student));
        Queue<Student> Nam=new LinkedList<>();
        Queue<Student> Nu=new LinkedList<>();
        for (int i=0;i<6;i++){
            if (  student[i].getGender().equals("nữ") ){
                Nu.add(student[i]);
            }else if (student[i].getGender().equals("nam")){
                Nam.add(student[i]);
            }
        }
        while (!Nu.isEmpty()){
            System.out.println(Nu.remove().toString());
        }
        while (!Nam.isEmpty()){
            System.out.println(Nam.remove().toString());
        }
    }
}
