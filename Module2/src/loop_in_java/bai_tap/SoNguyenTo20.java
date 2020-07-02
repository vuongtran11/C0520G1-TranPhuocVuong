package loop_in_java.bai_tap;

import java.util.Scanner;

public class SoNguyenTo20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many prime?");
        int count = 0;
        int number = scanner.nextInt();
        int i;
        int N = 2;
        String str = "Result :";
        while (count < number) {
            for (i = 2; i < N; i++) {
                if (N % i == 0) {
                    break;
                }
            }
            if (i == N) {
                str += N + " ";
                count++;
            }
            N++;
        }
        System.out.println(str);
    }
}
