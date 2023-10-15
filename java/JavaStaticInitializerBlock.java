import java.util.Scanner;

class JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int breadth = input.nextInt();
        int height = input.nextInt();

        if(breadth > 0 && height > 0) {
            System.out.println(breadth * height);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        input.close();
    }
}