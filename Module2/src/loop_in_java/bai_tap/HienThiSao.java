package loop_in_java.bai_tap;

public class HienThiSao {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 7; j++) {
                System.out.printf("* ");
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                System.out.printf("* ");
            }
        }
        for(int i=5;i>=0;i--){
            System.out.println("");
            for(int j=0;j<i;j++){
                System.out.printf("* ");
            }
        }
    }
}
