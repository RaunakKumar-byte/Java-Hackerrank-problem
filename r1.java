import java.util.*;


public class r1{
    public static void main(String args[]){
        System.out.println("Raunak singh");

        double temp=103.5;

        if(temp>100){
            System.out.println("fevwe");
        }
        else{
            System.out.println("do not hava feaver");
        }

        int num=12345;
        while(num>0){
            int digit=num%10;
            System.out.println(digit + " ");
            num=num/10;

           
        }
        System.out.println();


        int n1=10899;
        int reverse=0;
        while(n1>0){
            int last_digit=n1%10;
            n1=n1/10;
            reverse=(reverse*10)+last_digit;
        }
        System.out.println(reverse);
         
        
    }
}