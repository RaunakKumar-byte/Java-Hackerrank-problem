import java.util.*;

public class Strings_3{




    public static double getshrpath(String str1){
        int x=0;
        int y=0;

        for(int i=0;i<str1.length();i++){
    if(str1.charAt(i)=='N'){
        y++;
    }

   else   if(str1.charAt(i)=='S'){
        y--;
    }

   else  if(str1.charAt(i)=='W'){
        x--;
    }

    else{
        x++;
    }
  }
  int X2=x*x;
  int Y2=y*y;

  return Math.sqrt(X2 + Y2);
        

    }

    public static void main(String args[]){

  Scanner sc=new Scanner(System.in);
  String str1=sc.next();

  double result=getshrpath(str1);


  System.out.println("Shortest path is" +result);

  /*int x=0;
  int y=0;

  for(int i=0;i<str1.length();i++){
    if(str1.charAt(i)=='N'){
        y=y+1;
    }

   else   if(str1.charAt(i)=='S'){
        y=y-1;
    }

   else  if(str1.charAt(i)=='W'){
        X=X-1;
    }

    else if(str1.charAt(i)=='E'){
        X=X+1;
    }
  }*/
        
        
    }
}