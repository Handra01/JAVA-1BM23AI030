
import java.util.Scanner;

public class str_handling {
    public static void main(String[] args){

        StringBuffer sb1=new StringBuffer();
        System.out.println("capacity of the sb1:"+ sb1.capacity());
        StringBuffer sb2= new StringBuffer("gello");
        System.out.println("capacity of sb2:"+ sb2.capacity());


        Scanner s= new Scanner(System.in);
        System.out.println("enter str:");
        String sb3in= s.nextLine();
        StringBuffer sb3in2= new StringBuffer(sb3in);
        String a=sb3in2.reverse().toString().toUpperCase();
        System.out.println("reversed str in uppercase:"+ a);

        System.out.println("enter the str:");
        String ins=s.nextLine();
        System.out.println("concatenated str:"+ a+ins);
    }
}
