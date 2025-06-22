public class arrays_subarrays10{

    public static void subarrays(int Arrays[]){
        int ts=0;
        for(int i=0;i<Arrays.length;i++){
            int start=i;
            for(int j=i+1;j<Arrays.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){//print
                    System.out.print("{"+Arrays[k]+"}");
                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays are :"+ts);    }



    public static void main(String args[]){

        int arrays[]={1,2,3,4,5,6,7,8};
        subarrays(arrays);

    }
}