package generic_stack_queue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrrome {
    public static void main(String[] args) {
//        Queue<Character> charQueue=new LinkedList<>();
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Nhap chuoi:");
//        String str=scanner.nextLine();
//        for(int i=str.length()-1;i>=0;i--){
//            charQueue.offer(str.charAt(i));
//        }
//
//        for(int i=0;i<str.length();i++){
//            if(charQueue.remove()!=str.charAt(i)){
//                System.out.println("Đây không phải chuỗi palindrome");
//                break;
//            }else if(i==str.length()-1){
//                System.out.println("Đây là chuỗi palindrome");
//            }
//        }

        /*String str1 = "abccbad";
        String str2 = new StringBuffer(str1).reverse().toString();
        System.out.println(str1.equals(str2));*/

        System.out.print("Nhap vao chuoi :");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Queue<Character> queue = new LinkedList<Character>();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.offer(inputString.charAt(i));
        }
        boolean flag = true;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != queue.poll()) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
