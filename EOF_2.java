import java.io.*;
import java.util.*;

public class EOF_2 {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int linenumber=1;
    while(sc.hasNextLine()){
        String line=sc.nextLine();
    System.out.println(linenumber+" "+line);
    linenumber++;
    }
    
    }
}