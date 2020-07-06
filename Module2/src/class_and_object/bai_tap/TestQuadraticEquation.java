package class_and_object.bai_tap;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        double a=scanner.nextDouble();
        System.out.println("Enter number b:");
        double b=scanner.nextDouble();
        System.out.println("Enter number c:");
        double c=scanner.nextDouble();
        QuadraticEquation quad = new QuadraticEquation(a,b,c);
        if(quad.getDiscriminant()<0){
            System.out.println("No root");
        }else {
            System.out.println("Root1 is:"+quad.getRoot1());
            System.out.println("Root2 is:"+quad.getRoot2());
        }
    }
}
