public class arrays_4{
    public static void update(int marks[], int t){
        t=t+1;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
//arrays are pass by refrence and t are pass by value

    public static void main(String args[]){
        int marks[]={76,76,90};
        int t=5;
        update(marks,t);
        //print our marks
        System.out.println(t);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}