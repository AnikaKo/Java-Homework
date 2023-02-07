package ClassBefore9HW;

import java.util.Scanner;

public class homeWork6 {
    public static void main(String[] args) {
    /* Write a program to find largest number among three numbers using nested if provided by
    a user (numbers must be distinct)*/

        int number1, number2, number3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter 3 numbers ");
        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();
        // Break till 12:10
        if(number1>number2){
            if(number1>number3){
                System.out.println("Number is the largest "+number1);
            }
        }
        if(number2>number1){
            if(number2>number3){
                System.out.println("Number 2 is largest "+number2);
            }
        }
        if(number3>number1){
            if(number3>number2){
                System.out.println("Number 3 is largest"+number3);}
            }










       /* Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1= input.nextInt();
        System.out.println("Enter a number");
        int num2= input.nextInt();
        System.out.println("Enter a number");
        int num3= input.nextInt();

       if(num1>num2 && num1>num3){
            System.out.println("Num1 is the largest");}
            else if(num2>num1 && num2>num3){
                System.out.println("Num2 is the largest");}
            else{
                System.out.println("Number3 is the largest" );}*/









    }
}