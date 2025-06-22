public class oops_cons{
    public static void main(String args[]){


    Student s1=new Student("Raunak",23);
    System.out.println(s1.name);
    System.out.println(s1.rollno);
    }
}


class Student{
    String name;
    int rollno;


    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
        System.out.println("my name is Raunak kumar");

    }
}