package generic_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class NhiPhanSangThapPhan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str;
        System.out.println("Vui long nhap chuoi nhi phan:");
        str=scanner.nextLine();
        Stack<Character> list=new Stack<>();
        for(int i=0;i<str.length();i++){
            list.push(str.charAt(i));
        }
        System.out.println("Stack: "+list);
        int tong=0;
        int a;
        int index=1;
        char c=list.pop();
        if(c=='0'){
            tong=0;
        }else if(c=='1'){
            tong=1;
        }
        while(!list.isEmpty()){
            a=2*Integer.parseInt(String.valueOf(list.pop()));
            System.out.println(Math.pow(a,index));
            tong+=Math.pow(a,index);
            index++;

        }
        System.out.println("Tong: "+tong);
    }
}
