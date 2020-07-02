package array_and_method.bai_tap;

import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Input a number to removed: ");
        int number = scanner.nextInt();
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                index = i;
                System.out.println("Index is: " + index);
                break;
            }
        }
        System.out.println("Array after remove: ");
        for (int i = index; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}

