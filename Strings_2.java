import java.util.*;


public class Strings_2{


public static boolean checkpallindrome(String str){
    for(int i=0;i<str.length()/2;i++){
        int n=str.length();
      
      if(str.charAt(i) != str.charAt(n-i-1)){
        System.out.println(str+ "is  not pallindrome");
        return false;
      }
      
    }
    return true;
}

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        String str1=sc.next();

        //call the function

        System.out.println(checkpallindrome(str1));


    }
}