import java.util.*;

public class binarysearch{

    public static int bs(int arr[], int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
        int mid=(start+end)/2;

        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
            end=mid-1;
        }
        else{
            start=mid+1;
        }

        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] array =new int[7];
        System.out.println("Enter the element of array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the key element");
        int key=sc.nextInt();

        int index=bs(array,key);
          if (index != -1) {
            System.out.println("Key element found at index " + index);
        } else {
            System.out.println("Key element not found.");
        }
        
        sc.close();
    }
}