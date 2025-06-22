import java.util.*;



public class Strings_1{



    public static void printletters(String str){
    for(int i=0;i<str.length();i++){
        System.out.print(str.charAt(i)+" ");
    }
    System.out.println();
}





    public static void main(String args[]){
        char arr[]={'a','b','c','d','d'};
        String str1 = "abcd";
        String str2=new String("xyz");

        //string are immutable

        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();

        System.out.println(name);

        System.out.println(name.length());


        String firstname="Raunak";
        String lastname="singh";
        //concatenation

        String fullname=firstname+" "+lastname;
        System.out.println(fullname +"is this");

        //charAt method

        System.out.println(fullname.charAt(3));

        //call function
        printletters(fullname);

    }
}