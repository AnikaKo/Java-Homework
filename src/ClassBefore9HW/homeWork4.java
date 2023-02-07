package ClassBefore9HW;

import java.util.Scanner;

public class homeWork4 {
    public static void main(String[] args) {
        /*4)Write a program for user to enter his/hers birth Homeworks.month. Based on the Homeworks.month define the season.
Example: if user is born in June, July or August → season =”Summer”.
At the end of the program we should see output as “You were born __”*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your birthday Homeworks.month");
        String month= input.nextLine();
        if(month.equals("June")||month.equals("July")||month.equals("August")){
            System.out.println("Summer");}
        else {
            System.out.println("You were born in "+month);}
    }
}
