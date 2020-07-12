package dsa_danhsach.bai_tap;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Trung");
        Student student2 = new Student(1, "Hai");
        Student student3 = new Student(1, "Kien");
        Student student4 = new Student(1, "Duc");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        //myLinkedList.addLast(student3);
        myLinkedList.add(2,student4);

       // myLinkedList.remove(2);

        //MyLinkedList<Student> cloneLinkedList=myLinkedList.clone();

        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
    }
}
