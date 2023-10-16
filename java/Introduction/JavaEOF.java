import java.util.Scanner;

class JavaEOF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        while(input.hasNext()) {
            System.out.println(i + " " + input.nextLine());
            i++;
        }
        input.close();
    }
}