import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = largest = s.substring(0, k);

        // [1   2   3   4   5]
        // [12, 23, 34, 45]

        // [1    2    3    4    5    6    7    8    9    10   11   12   13]
        // [w    e    l    c    o    m    e    t    o    j    a    v    a]
        // [wel, elc, lco, com, ome, met, eto, toj, oja, jav, ava]
        for(int i = 1; i < s.length()-k+1; i++) {
            String substring = s.substring(i, i + k);
            if(substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if(substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}