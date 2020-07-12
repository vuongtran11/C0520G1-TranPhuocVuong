package generic_stack_queue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrrome {
    public static void main(String[] args) {
        Queue<Character> charQueue=new LinkedList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str=scanner.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            charQueue.offer(str.charAt(i));
        }

        for(int i=0;i<str.length();i++){
            if(charQueue.remove()!=str.charAt(i)){
                System.out.println("Đây không phải chuỗi palindrome");
                break;
            }else if(i==str.length()-1){
                System.out.println("Đây là chuỗi palindrome");
            }
        }

    }
}
