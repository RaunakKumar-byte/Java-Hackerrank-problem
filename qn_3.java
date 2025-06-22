import java.io.*;
import java.util.*;

public class qn_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int B=sc.nextInt();
        
        if(H>0 && B>0){
            System.out.println(H*B);
        }
        else{
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }
}