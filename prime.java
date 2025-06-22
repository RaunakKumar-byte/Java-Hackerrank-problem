import java.util.*;

public class prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        boolean isprime=true;

        for(int i=2;i<n;i++){//Math.sqrt(n);
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime==true){
            System.out.println("number is prime:"+n);
        }
        else{
            System.out.println("number is not prime");
        }
    }
}