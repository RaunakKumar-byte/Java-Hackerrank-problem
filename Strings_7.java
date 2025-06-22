public class Strings_7{


    public static String compression(String str){
        for(int i=0;i<str.length();i++){
            char ch(i);
            integer count=1;
            while(ch(i) == ch(i+1)){
                count++;
            }
            if(count>1){
                System.out.println(ch(i)+""+count);
            }
            else{
                System.out.println(ch(i));
            }
        }
    }
    public static void main(String args[]){

    }
}