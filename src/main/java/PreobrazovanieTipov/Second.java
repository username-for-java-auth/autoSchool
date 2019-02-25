package PreobrazovanieTipov;

import java.util.Scanner;

/**
 * Created by 1 on 23/02/2019.
 */
public class Second {
    static int number;
    //static int sum;


    public static void main (String [] args){
        System.out.println("Enter the number");
        Scanner input=new Scanner(System.in);


        String enteredNumber=input.next();
        number=Integer.parseInt(enteredNumber);


        System.out.println("Sum: "+Sum(enteredNumber));
    }

    public static int Sum(String enteredNumber){
        int sum=0;
        for(int i=0;i<enteredNumber.length();i++){

            sum =sum+number%10;
            number=(int)Math.floor(number/10);
        }
        return sum;
    }
}
