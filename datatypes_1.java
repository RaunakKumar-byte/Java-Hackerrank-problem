import java.util.Scanner;

class datatypes_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            try {
                // Read the number as a long to avoid overflow
                long n = sc.nextLong();

                // Print all applicable data types
                System.out.println(n + " can be fitted in:");
                if (n >= -128 && n <= 127) {
                    System.out.println("* byte");
                }
                if (n >= -32768 && n <= 32767) {
                    System.out.println("* short");
                }
                if (n >= -2147483648L && n <= 2147483647L) {
                    System.out.println("* int");
                }
                if (n >= -9223372036854775808L && n <= 9223372036854775807L) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                // Handle overflow inputs
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}