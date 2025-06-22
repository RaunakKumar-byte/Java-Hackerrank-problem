public class oops_inher{
    public static void main(String args[]){
     deer d= new deer();
     d.eat(); 
    }
}

class animals{
    void eat(){
        System.out.println("eat anything");
    }
}
class deer extends animals{
    System.out.println("eat grass");
}