import java.util.Scanner;

public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", N, i, N*i);
        }
        input.close();
    }
}