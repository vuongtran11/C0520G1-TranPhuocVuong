package loop_in_java.bai_tap;

public class ShowPrimeUnderLess100 {
    public static void main(String[] args) {
        boolean check = true;
        String str = "Result: ";
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
                check = true;
            }
            if (check) str += i + " ";
        }
        System.out.println(str);
    }
}
