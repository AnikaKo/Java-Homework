package HomeworksBeforeClass9;

import java.util.Scanner;

public class dmv {
    public static void main(String[] args) {
        /*You are DMV representative and you need to ask customer their age.
        If they are 18 and older you will issue a driver licence to them, otherwise you will
        offer them to get a learners permit.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("Issue");
        } else {
            System.out.println("Get a learners");
        }
    }
}
