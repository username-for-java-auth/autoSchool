package PrimitivnieTipy; /**
 * Created by 1 on 16/02/2019.
 */
import static sun.misc.Version.print;
import java.io.PrintStream;
import java.util.Scanner;

public class HelloWorld {
   public static String name;

    public static void main (String [] args){
        System.out.println("Enter your name,please ");
        Scanner input=new Scanner(System.in);

        name=input.next();
        ShowString(name);
    }
    public static void ShowString(String name){

        System.out.println("Hello, "+ name);
    }
}
