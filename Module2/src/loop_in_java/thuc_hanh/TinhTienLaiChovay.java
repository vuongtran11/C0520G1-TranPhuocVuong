package loop_in_java.thuc_hanh;

import java.util.Scanner;

public class TinhTienLaiChovay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate = scanner.nextDouble();
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * 3;
            System.out.println("Total of interset: " + total_interset);
        }
    }
}
