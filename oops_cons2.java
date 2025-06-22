public class oops_cons2{
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student("Raunak");
        Student s2=new Student(32);

    }
}

class Student{
    String name;
    int rollno;

    Student(){
        System.out.println("MY name is Raunak kumar");
    }
    Student(String name){
        this.name=name;
    }
    Student(int rollno){
        this.rollno=rollno;
    }
}