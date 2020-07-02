package introduction_to_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scanner.nextInt();
        String result = null;
        if (number <= 9 && number >= 0) {
            result = getOneToNine(number);
        } else if (number >= 10 && number <= 20) {
            result = getTenToTwenty(number);
//        } else if (number >= 21 && number <= 90) {
//            result = getTwentyToNinety(number);
        } else if (number >= 21 && number <= 99) {
            result = getTwentyOneToNinetyNine(number);
        }
        System.out.println(result);
    }

    public static String getTwentyOneToNinetyNine(int number) {
        String result = null;
//        switch (number) {
//            case 21:
//            case 31:
//            case 41:
//            case 51:
//            case 61:
//            case 71:
//            case 81:
//            case 91:
        int a = number / 10;
        result = getTwentyToNinety(a * 10);
        int b = number % 10;
        result = result + " " + getOneToNine(b);
//                result = getTwentyToNinety(a) + getOneToNine(b);
//                break;
//        }
        return result;
    }

    public static String getTwentyToNinety(int number) {
        String result = null;
        switch (number) {
            case 20:
                result = "twenty";
                break;
            case 30:
                result = "thirty";
                break;
            case 40:
                result = "forty";
                break;
            case 50:
                result = "fifty";
                break;
            case 60:
            case 70:
            case 80:
            case 90:
                int first = number / 10;
                result = getOneToNine(first) + "ty";
                break;
        }
        return result;
    }

    public static String getTenToTwenty(int number) {
        String result = null;
        switch (number) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                result = getTenToFifteen(number);
                break;
            case 16:
            case 17:
            case 18:
            case 19:
                int remain = number % 10;
                result = getOneToNine(remain) + "teen";
                break;
            case 20:
                result = "twenty";
                break;
        }
        return result;
    }

    public static String getTenToFifteen(int number) {
        String result = null;
        switch (number) {
            case 10:
                result = "ten";
                break;
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "twelve";
                break;
            case 13:
                result = "thirteen";
                break;
            case 14:
                result = "fourteen";
                break;
            case 15:
                result = "fifteen";
                break;
        }
        return result;
    }

    public static String getOneToNine(int number) {
        String result = null;
        switch (number) {
            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
        }
        return result;
    }
}
