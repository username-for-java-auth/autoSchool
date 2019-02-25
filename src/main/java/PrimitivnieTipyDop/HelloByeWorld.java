package PrimitivnieTipyDop; /**
 * Created by 1 on 18/02/2019.
 */

import PrimitivnieTipyDop.com.Welcome.Hello;

import java.util.Scanner;

public class HelloByeWorld {

    public static void main (String []args){
        System.out.println("Enter your name,please ");
        Scanner input=new Scanner(System.in);

        String name=input.next();
        Hello man=new Hello();
        man.setupName(name);
        man.welcome();
        System.out.println("Hello, world");
        man.byeBay();
    }
}
