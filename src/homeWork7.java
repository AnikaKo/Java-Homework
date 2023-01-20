import java.util.Scanner;

public class homeWork7 {
    public static void main(String[] args) {
        /*7) Ask user to enter their country and capture it.
        Once values are captured print which language user speaks.Allow user to enter grade and then provide
         explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
         At the end your program should print which grade was entered by a user with explanation.*/
        Scanner input=new Scanner(System.in);
        System.out.println("Where are you from");
        String country = input.nextLine();
        System.out.println("what language do you speak");
        String language=input.nextLine();
        System.out.println("Enter grade");
        char grade=input.next().charAt(0);

        switch (grade){
            case 'A':{
                System.out.println("excelent");}
            case 'B':{
                    System.out.println("good");}
            case 'C':{
                        System.out.println("average");}
            case 'D':{
                System.out.println("bad");}
            default:{
                System.out.println("not accetable");}
                    }


    }
}
