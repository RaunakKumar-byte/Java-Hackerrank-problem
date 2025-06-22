import java.util.*;

public class java5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);


        System.out.println("Enteer the number of integer");
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        

        for(int i=0;i<n;i++){

            int num=sc.nextInt();//Read the integer
            if(num%2==0){
                evensum=evensum+num;
            }
            else{
                oddsum+=num;
            }
        }
        
        System.out.println("sum of even number :"+evensum);
         System.out.println("sum of odd number :"+oddsum);
    }
}