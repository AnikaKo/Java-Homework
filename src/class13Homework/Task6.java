package class13Homework;

public class Task6 {
    public static void main(String[] args) {
 // 6) How would you swap  2 strings without a temporary variable?
    String a ="Anika";
    String b="Mimi";

    a=a+b;
    b=a.substring(0,a.length()-b.length());
    a=a.substring((b.length()));
        System.out.println(a+" "+b);
/* ako je INT u pitanju
int a =20;
int b=30;
a=a+b;
b=a-b;
a=a-b;
System.out.println(a+" "+b):
 */




    }
}
