import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        for(int i = 0; i < q; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            long prev = Math.round((a + (Math.pow(2, 0) * b)));
            for(int j = 1; j < n + 1; j++) {
                long curr = Math.round(((Math.pow(2, j) * b)) + prev);
                System.out.print(prev + " ");
                prev = curr;
            }
            System.out.print("\n");
        }

        input.close();
    } 
}
