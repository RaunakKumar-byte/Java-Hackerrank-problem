import java.util.*;

public class java4{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        
    do{
        System.out.println("enter number");
        int number=sc.nextInt();
        if(number%10==0){
        continue;}
        System.out.println("number was :" +number);

    }while(true);
        
    
    }
}