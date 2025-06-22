import java.util.Scanner;

public class HourglassSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];

        // Read the 6x6 array
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int maxSum = Integer.MIN_VALUE;

        // Only valid centers are from (1,1) to (4,4)
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                int sum = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1]
                         + arr[i][j]
                         + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }
}
