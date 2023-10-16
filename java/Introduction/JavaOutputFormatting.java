import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++) {
            String s1 = input.next();
            int x = input.nextInt();
            if(x < 10) {
                System.out.printf("%-14s %03d %n", s1, x);
            } else if (x >= 10 && x < 100) {
                System.out.printf("%-14s %03d %n", s1, x);
            } else {
                System.out.printf("%-14s %d %n", s1, x);
            }
        }
        System.out.println("================================");
        input.close();
    }
}