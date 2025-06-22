import java.util.*;

public class arrays_6{

   public static int largestnum(int Array[]){

    int largest=Integer.MIN_VALUE;
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<Array.length;i++){
        if(largest<Array[i]){
             largest=Array[i];
        }
        if(smallest>Array[i]){
            smallest=Array[i];
        }
    }
    System.out.println("Smallest element is :"+smallest);
    return largest;
   }


    public static void main(String args[]){

        int num[]={1,2,5,4,7,3};
        int larg=largestnum(num);
        System.out.println("so the largest num in our array is :"+larg);

    }
}