import java.util.Scanner;

public class homeWork8 {
    public static void main(String[] args) {
        /*8)HomeWork: Using scanner class create calculator.
        Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result
        to user.*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers and operators +,-,*,/ ");
        int num1=input.nextInt();
        int num2= input.nextInt();
      char operator=input.next().charAt(0);

      switch (operator){
          case '+':{
              System.out.println(num1+num2);}
          break;
          case '-':{
              System.out.println(num1-num2);}
          break;
          case '*':{
              System.out.println(num1*num2);}
          break;
          case '/':{
              System.out.println(num1/num2);}
          break;

      }


    }
}
