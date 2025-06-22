public class oops_copycons{
    public static void main(String args[]){
        students s1=new students();
        s1.name="Raunak";
        s1.rollno=23;
        s1.passoword="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        students s2=new students(s1);
        s1.marks[2]=100;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }



    }
}

class students{
    String name;
    int rollno;
    String passoword;
    int marks[];

    // shallow copy constructor
 /*   students(students s1){
        marks=new int[3];
        this.name=s1.name;
        this.rollno=s1.rollno;
        this.marks=s1.marks;
    }*/

   //deep copy
    students(students s1){
        marks=new int[3];
        this.name=s1.name;
        this.rollno=s1.rollno;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }

    }

        
    students() {
        marks=new int[3];
        System.out.println( "Constructor body");
    }


    
}