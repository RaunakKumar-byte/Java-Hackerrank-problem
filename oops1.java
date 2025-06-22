import java.util.*;

public class oops1{
    public static void main(String args[]){

        Pen p1=new Pen();//we have created a pen object is called p1
        

        p1.setcolor("Blue");
        System.out.println(p1.color);

        p1.settip(5);
        System.out.println(p1.tip);

        p1.color="Yellow";
        System.out.println(p1.color);


        Bankaccount myAcc=new Bankaccount;
        myAcc.username="Raunaksingh";

        myAcc.Setpassoword("abcdefgh");

    }
}

class Bankaccount{
    public String username;
    private String passoword;


    public void Setpassoword(String pwd){
         passoword=pwd;
    }


}

class Pen{
    int tip;
    String color;


    int gettip(){
        return this.color;
    }


    int getcolor(){
        return this.color;
    }

    void setcolor(String newcolor){
        this.color=newcolor;
    }
    void settip(int tip){
        this.tip=newtip;
    }





}
class Student{
    String name;
    int age;
    float percentage;


    void calcpercentage(int phy, int chem, int math){
        percentage=(phy+chem+math)/3;
    }
}