public class maxsubarraysum{
    
    public static void sbarrsum(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;


        int ts=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i+1;j<arr.length;j++){
                int end=j;
                for(int k=start;k<end;k++){
System.out.print("{"+arr[k]+"}");
                 currsum += arr[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("maxsum = "+maxsum);
        
    }
    public static void main(String args[]){

  int arr[]={1,2,3,-1,4};
   sbarrsum(arr);

    }
}