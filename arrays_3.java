import java.util.*;

public class arrays_3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("number to search in matrix");
        int x=sc.nextInt();
        int rows=sc.nextInt();
        int cols=sc.nextInt();


        int matrix[][]=new int[rows][cols];
//for input
//for control the rows
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //for output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==x){
                    System.out.println("{index of the number is :( " +i+","+j+")");
                }
            }
         }

    }
}