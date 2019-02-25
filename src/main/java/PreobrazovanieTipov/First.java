package PreobrazovanieTipov;

import java.util.Scanner;

/**
 * Created by 1 on 21/02/2019.
 */
public class First {

    static int q;
    static int w;

    public static void main (String [] args){
        System.out.println("Enter numerator:");
        Scanner input=new Scanner(System.in);
        q=Integer.parseInt(input.next());

        System.out.println("Enter denomenator:");
        w=Integer.parseInt(input.next());

        if (w!=0){

        System.out.println(q+"/"+w+"="+q/w+" и "+q%w+" в остатке");
        }
        else
            System.out.println("Incorrect denomenator");
    }
}
