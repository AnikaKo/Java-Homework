package class14Homework;

public class Task2 {
  //      2) Create a method that will take a number and prints whether the number is even or odd.

    String evenOdd (int a){
        String flag="";
        if(a%2==0){
            flag="even";
        }else{
            flag="odd";
        }
        return flag;
    }

    public static void main(String[] args) {
        Task2 ak=new Task2();
        System.out.println(ak.evenOdd(13));
    }
}
