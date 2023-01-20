package Homeworks;

import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        /*Create a Java program that will ask user to input city and temperature.
        Your program should Homeworks.convert Fahrenheit into celsius and print “The temperature is the city
         is */

        Scanner input = new Scanner(System.in);
        System.out.println("enter the city");
        String city=input.nextLine();
        System.out.println("enter the t");
        int t=input.nextInt();

        System.out.println("the temperature in the "+city+" is "+((t-32)*5)/9);
    }
}
