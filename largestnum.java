import java.util.Scanner;

public class largestnum {

    
    public static int largestnum(int num[]) {
        int largest = Integer.MIN_VALUE; 

        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Declare and initialize the array
        int array[] = new int[6]; 

        
        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt(); 
        }

        
        int largeno = largestnum(array);
        System.out.println("The largest number is: " + largeno);

        sc.close(); 
    }
}
