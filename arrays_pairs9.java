public class arrays_pairs9{


    public static void pairs(int Array[]){
        
    int tp=0;
        for(int i=0;i<Array.length;i++){
            for(int j=i+1;j<Array.length;j++){
                System.out.print("("+Array[i]+","+Array[j]+")");
                tp++;
            
        }
        System.out.println();
    }
    System.out.println("total no of pairs are :"+tp);
    }
    public static void main(String args[]){

        int array[]={2,3,4,5,6,7,8};
        pairs(array);
    }
}
