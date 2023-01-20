import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {/*1) Prompt the user to enter person heights in inches.
    Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)*/
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your heights");
        int heights = input.nextInt();

        if(heights<60){
            System.out.println("short");}
        else if((heights>60)&&(heights<72)){
            System.out.println("medium");}
            else if (heights>72){
            System.out.println("tall");}

    }

}
