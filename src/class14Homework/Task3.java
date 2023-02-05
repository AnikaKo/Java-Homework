package class14Homework;

public class Task3 {
//3) Create a method that will print whether given String is palindrome or not.
void palindrome(String a){
    StringBuilder ak=new StringBuilder();
    ak.reverse();
    String reversed=ak.toString();
    if(a.equals(reversed)){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not a palindrome");
    }
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
      task3.palindrome("anika");


    }
}
