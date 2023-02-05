package class17Homework;

public class Task1 {

 //  1) Write a java class that will have a constructor: one with parameters and second without any parameters.
 //  Create a separate Test class where you will execute both of the constructors 1 by 1.
    int a;
    Task1(){
      a=2;
        System.out.println("Constructor with no parameters");
    }

    String student;
    int age;

    Task1(String sStudent, int sAge){
        student=sStudent;
        age=sAge;
    }
    void prinInfo(){
        System.out.println("Student "+student+" is "+age+" years old");
    }
}
