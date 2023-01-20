package Homeworks;

import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        /*You are a Homeworks.loan specialist and you need to ask user
    what is the amount of Homeworks.loan is needed. If Homeworks.loan is less or equal to 200,000 then you would
    lend the money otherwise you would reject the client */
        Scanner input=new Scanner(System.in);

        System.out.println("What is the amount of Homeworks.loan is needed");
        int amount=input.nextInt();
        if(amount<=200000){
            System.out.println("Land the money");}
        else{
            System.out.println("Reject");}






}

}