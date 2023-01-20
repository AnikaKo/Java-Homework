package HomeworksBeforeClass9;

import java.util.Scanner;

public class annualSalary {
    public static void main(String[] args) {
        /* Write a program to ask user to enter numbers of worked years and annual salary.
        If user worked for more or equals to 5 years than user is eligible for the bonus,
        otherwise he is not. Once user is eligible and salary is larger than 50000 than
        bonus = 5000, otherwise bonus=3000.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of worked years");
        int years = input.nextInt();
        System.out.println("Enter annual salary");
        int salary = input.nextInt();
        if (years >= 5) {
            if (salary > 50000) {
                System.out.println("You have bonus and it will be 5000");
            } else {
                System.out.println("Bonus is 3000");
            }
        } else {
            System.out.println("no bonus");
        }
    }








    }

