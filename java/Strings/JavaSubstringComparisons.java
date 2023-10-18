import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String[] substring = new String[];

        for (int i = 0; k <= s.length(); i++) {
            substring[i] = s.substring(i, k);
            k += 1;
        }

        // Look for smallest substring
        smallest = substring[0];
        for (int j = 0; j < substring.length; j++) {
            if (substring[j].compareTo(smallest) < 0) {
                // if a smaller substring is found then swap it with the first position in the
                // list
                String tmp = substring[0];
                substring[0] = substring[j];
                substring[j] = tmp;
            }
        }

        // Sort the list
        for (int i = 1; i < substring.length - 1; i++) {
            if (substring[i + 1].compareTo(substring[i]) < 0) {
                // if a smaller substring is found then swap it with the first position in the
                // list
                String tmp = substring[i];
                substring[i] = substring[i + 1];
                substring[i + 1] = tmp;
            }
        }

        smallest = substring[0];
        largest = substring[substring.length - 1];
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        // getSmallestAndLargest(s, k);
        System.out.println(getSmallestAndLargest(s, k));
    }
}