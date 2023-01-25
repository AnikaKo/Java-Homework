package Class12Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
   //  Write a program that reads two people's first names and if they expecting boy or girl?
    //  Based on the input suggests a name for a baby:
        //Example Output: Mom’s first name? Mary Dad’s first name? Daniel
        //Boy or Girl? boy Suggested baby name: DANRY
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name");
        String mama = input.nextLine();
        System.out.println("Enter your first name");
        String dad = input.nextLine();
        System.out.println("Boy or a girl");
        String child=input.nextLine();

        if(!mama.equals(mama.isBlank()) && !dad.equals(dad.isBlank()) ){
            if(child.equals("boy")){
                System.out.println("Danry");}
        }else {
            System.out.println("Maiel");}
    }
}
