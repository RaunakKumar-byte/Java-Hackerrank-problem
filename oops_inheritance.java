public class oops_inheritance{
    public static void main(String args[]){

        dog dobby=new dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);

    }
}

class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathe");
    }
}

//derived class
/*class Fish extends Animal {
    int wings;

    void wings(){
        System.out.println("wings");
    }
}*/

class mmammal extends Animal{
    int legs;
}
class dog extends mmammal{
    String breed;
}