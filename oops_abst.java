public class oops_abst{
    public static void main(String args[]){
        Horse h1=new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);



        Chicken c1=new Chicken();
        c1.eat();
        c1.walk();

    }
}

abstract class Animal{
    String color;

    //constructor

    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    void colorchange(){
        color="dark Brown ";
    }
    void walk(){
        System.out.println("Walks on 4 leg");
    }
}
class Chicken Animal{
    void colorchange(){
        color="Red";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}