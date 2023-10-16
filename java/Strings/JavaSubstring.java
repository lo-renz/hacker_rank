import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        String s = input.nextLine();
        int start = input.nextInt();
        int end = input.nextInt();

        System.out.println(s.substring(start, end));
        input.close();
    }
}
