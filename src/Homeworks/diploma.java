package Homeworks;

public class diploma {
    public static void main(String[] args) {
        /*Write a program to store a boolean value of whether user has Homeworks.diploma or not.
         If user has a Homeworks.diploma, you should say congratulations, otherwise program should suggest
          to get a degree.Then if user has a degree program should check a gpa score.
         If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”,
         otherwise → “You should have studied harder” .
         */
        boolean diploma = true;
        int gpa = 4;
        if (diploma) {
            System.out.println("Congratilations");
        } else {
            System.out.println("Get a degree");
        }
        if (diploma) {
            if (gpa >= 3.5) {
                System.out.println("you are eligible for scholarship");
            } else {
                System.out.println("you should have studied  harder");
            }
        }
    }
}
