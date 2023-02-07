package ClassBefore9HW;

import java.util.Scanner;

public class homeWork5 {
    public static void main(String[] args) {
        /*5) Write a program to find largest of three double values using if-else..if and
        logical operators provided by a user (numbers must be distinct)
         */
        Scanner input=new Scanner(System.in);
        System.out.println("first number");
        double num1= input.nextDouble();
        System.out.println("Second number");
        double num2 = input.nextDouble();
        System.out.println("Thired number");
       double num3= input.nextDouble();

        if(num1>num2&&num1>num3) {
            System.out.println("First number is the largest");
        }else if(num2>num1&&num2>num3){
                System.out.println("Second number is the largest");}
            else if (num3>num2&&num3>num1){
                System.out.println("Thired number is the largest");}

    }
}
