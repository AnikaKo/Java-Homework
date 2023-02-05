package class17Homework;

public class Student {

 //5) Write a Student class   that have instance variables name and address. Create a constructor that
// will initialize those variables. Print name & address of given  student using displayInfo method.
String name;
String address;

Student (String sName, String sAddress){
    name=sName;
    address=sAddress;
}
void printStudent(){
    System.out.println(name+" lives at "+address);

    }

    public static void main(String[] args) {
        Student student =new Student("Anika", "1330 Pennsylvania ave");
        student.printStudent();
    }
}
