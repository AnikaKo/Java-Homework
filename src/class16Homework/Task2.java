package class16Homework;

public class Task2 {

//    2) Create a method that will take a String as a parameter and returns reversed String.
//    Method should be available to all classes within your project and accessible by class name.

        String revStr(String a) {
            String newStr = "";
            for (int i = a.length() - 1; i >= 0; i--) {
                newStr += a.charAt(i);
            }
                return newStr;
            }

//or return new StringBuilder(a odn input).reverse().toString();


    public static void main(String[] args) {
            Task2 ak=new Task2();
        System.out.println(ak.revStr("Anika"));


    }
}
