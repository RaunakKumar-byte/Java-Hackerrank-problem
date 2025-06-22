public class arrays_BS7{
   
   public static int Binarysearch(int Array[],int key){
    int st=0;
    
    int end=Array.length-1;

    while(st<end){
        int mid=(st+end)/2;


        //comparision
        if(Array[mid]==key){
            return mid;
        }
        if(Array[mid]<key){//right
            st=mid+1;

        }else{//left
            end=mid-1;
        }

    }
    return -1;
   }

    public static void main(String args[]){

        int num[]={2,4,6,8,10,12,16};
        int key=12;

        System.out.println("indeax for key is :"+Binarysearch(num,key));

    }
}