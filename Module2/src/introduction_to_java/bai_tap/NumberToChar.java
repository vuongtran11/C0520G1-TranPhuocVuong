package introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumberToChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số bạn muốn đọc thành chữ");
        int number = scanner.nextInt();
        String result = null;
        int answer = number % 10;
        int answer1 = number / 10;
        int answer2 = number / 100;
        int answer3 = number % 100;
        int answer4 = answer3 / 10;
        int answer5 = answer3 % 10;
        if (0 <= number && number < 10) {
            switch (number) {
                case 0:
                    result = "zero";
                    break;
                case 1:
                    result = "one";
                    break;
                case 2:
                    result = "tow";
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
        } else if (10 <= number && number < 20) {
            switch (number) {
                case 10:
                    result = "teen";
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
                    result = "fiveteen";
                    break;
                case 16:
                    result = "sixteen";
                    break;
                case 17:
                    result = "seventeen";
                    break;
                case 18:
                    result = "eightteen";
                    break;
                case 19:
                    result = "nineteen";
                    break;
            }
        } else if (20 <= number && number < 100) {
            switch (answer1) {
                case 2:
                    result = "twenty";
                    break;
                case 3:
                    result = "thirty";
                    break;
                case 4:
                    result = "forty";
                    break;
                case 5:
                    result = "fifty";
                    break;
                case 6:
                    result = "sixty";
                    break;
                case 7:
                    result = "seventy";
                    break;
                case 8:
                    result = "eightty";
                    break;
                case 9:
                    result = "ninety";
                    break;
            }
            switch (answer) {
                case 1:
                    result += " one";
                    break;
                case 2:
                    result += " tow";
                    break;
                case 3:
                    result += " three";
                    break;
                case 4:
                    result += " four";
                    break;
                case 5:
                    result += " five";
                    break;
                case 6:
                    result += " six";
                    break;
                case 7:
                    result += " seven";
                    break;
                case 8:
                    result += " eight";
                    break;
                case 9:
                    result += " nine";
                    break;
            }
        } else if (100 <= number && number < 1000) {
            switch (answer2) {
                case 1:
                    result = "one hundred ";
                    break;
                case 2:
                    result = "tow hundred  ";
                    break;
                case 3:
                    result = "three hundred  ";
                    break;
                case 4:
                    result = "four hundred ";
                    break;
                case 5:
                    result = "five hundred ";
                    break;
                case 6:
                    result = "six hundred ";
                    break;
                case 7:
                    result = "seven hundred ";
                    break;
                case 8:
                    result = "eight hundred ";
                    break;
                case 9:
                    result = "nine hundred ";
                    break;
            }
            if (0 < answer3 && answer3 < 10) {
                switch (answer3) {
                    case 1:
                        result += "and one";
                        break;
                    case 2:
                        result += "and tow";
                        break;
                    case 3:
                        result += "and three";
                        break;
                    case 4:
                        result += "and four";
                        break;
                    case 5:
                        result += "and five";
                        break;
                    case 6:
                        result += "and six";
                        break;
                    case 7:
                        result += "and seven";
                        break;
                    case 8:
                        result += "and eight";
                        break;
                    case 9:
                        result += "and nine";
                        break;
                }
            } else if (10 <= answer3 && answer3 < 20) {
                switch (answer3) {
                    case 10:
                        result += "and ten";
                        break;
                    case 11:
                        result += "and eleven";
                        break;
                    case 12:
                        result += "and twelve";
                        break;
                    case 13:
                        result += "and thirteen";
                        break;
                    case 14:
                        result += "and fourteen";
                        break;
                    case 15:
                        result += "and fiveteen";
                        break;
                    case 16:
                        result += "and sixteen";
                        break;
                    case 17:
                        result += "and seventeen";
                        break;
                    case 18:
                        result += "and eightteen";
                        break;
                    case 19:
                        result += "and nineteen";
                        break;
                }
            } else if (20 <= answer3 && answer3 < 100) {
                switch (answer4) {
                    case 2:
                        result += "twenty";
                        break;
                    case 3:
                        result += "thirty";
                        break;
                    case 4:
                        result += "forty";
                        break;
                    case 5:
                        result += "fifty";
                        break;
                    case 6:
                        result += "sixty";
                        break;
                    case 7:
                        result += "seventy";
                        break;
                    case 8:
                        result += "eightty";
                        break;
                    case 9:
                        result += "ninety";
                        break;
                }
                switch (answer5) {
                    case 1:
                        result += " one";
                        break;
                    case 2:
                        result += " tow";
                        break;
                    case 3:
                        result += " three";
                        break;
                    case 4:
                        result += " four";
                        break;
                    case 5:
                        result += " five";
                        break;
                    case 6:
                        result += " six";
                        break;
                    case 7:
                        result += " seven";
                        break;
                    case 8:
                        result += " eight";
                        break;
                    case 9:
                        result += " nine";
                        break;
                }
            }
        }
        System.out.println(result);
    }
}
