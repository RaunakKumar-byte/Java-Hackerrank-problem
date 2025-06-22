public class arrays_LS5{

    public static int linearsearch(int Array[], int key){

        for(int i=0;i<Array.length;i++){
            if (Array[i]==key){
                return i;
            }
        }
     return -1;
    }
  public static void main(String args[]){

    int Array[]={2,4,6,8,10,12,14,16};
    int key=10;

    int index=linearsearch(Array,key);

    if(index==-1){
        System.out.println("not found");
    }
    else{
        System.out.println("key is found at index : "+index);
    }
  }
}