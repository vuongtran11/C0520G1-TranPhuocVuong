package demo;

public class RecursionTest {
    public static void print100(int i) {
        System.out.println(i);

        if (i == 100)
            return;

        print100(++i);
    }

    public static void main(String[] args) {
        print100(1);
    }
}
