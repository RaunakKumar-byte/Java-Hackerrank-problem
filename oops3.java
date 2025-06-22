public class oops3{
    public static void main(String args[]){

        pen P1=new pen();
        P1.settip(5);
        P1.setcolor("blue");
        System.out.println(P1.gettip());
        System.out.println(P1.getcolor());

    }
}
class pen{
    private String color;
    private int tip;


    int gettip(){
        return this.tip;
    }

    String getcolor(){
        return this.color;
    }
    void settip(int tip){
        this.tip=tip;
    }
    void setcolor(String color){
        this.color=color;
    }
}