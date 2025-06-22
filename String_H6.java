import java.io.*;
import java.util.*;

public class String_H6 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        int c=A.length()+B.length();
        System.out.println(c);
        if(A.compareTo(B)<0){
            System.out.println(A+" "+B);
        }
        else{
            System.out.println(B+" "+A);
        }
        
    }
}
