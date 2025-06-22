public class arrays_RS8{
      //reverse the array

      public static void reversearray(int Array[]){
        int first=0;
        int last=Array.length-1;

        while(first < last){
            int temp=Array[last];
            Array[last]=Array[first];
            Array[first]=temp;

            first++;
            last--;
        }
      }
    public static void main(String args[]){

        int num[]={2,3,4,6,7,89,8};
        reversearray(num);

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    System.out.println();
    }
}