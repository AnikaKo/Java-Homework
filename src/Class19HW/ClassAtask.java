package Class19HW;

public class ClassAtask {
// // Write program to inherit class A that has method printF
//    //which is static and call or reuse that method into class B

    static void printF(){
        System.out.println("Love java always");
    }
}
class Sclass extends ClassAtask {
    String object;
    String color;
    static void reusePrintF(){
        System.out.println("Java is great");
    }

}

