package ClassBefore9HW;

import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
     /*2) Write a program that will print whether it is a weekend or weekday.
      If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”,
      any other day → output “Invalid day” (edited)
      */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int day= input.nextInt();

         if(day>=1&&day<=5){
             System.out.println("It is a weekday");}
         else if(day>=6 && day<=7){
            System.out.println("It is a weekend");
         }
         else{
            System.out.println("Invalid day");}


    }
}
