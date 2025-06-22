import java.util.Scanner;

public class String_h7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read strings A and B
        String A = sc.nextLine();
        String B = sc.nextLine();

        // 1. Print the sum of lengths of A and B
        System.out.println(A.length() + B.length());

        // 2. Check lexicographical order and print "Yes" or "No"
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Capitalize the first letter of A and B and print them
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}



