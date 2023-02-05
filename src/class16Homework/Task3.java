package class16Homework;

public class Task3 {

//3) Create a method that will accept a String as a parameter and return a new String that consisonly ofvowels.
// Method should be available inside the class only where it was declared and executed by calling it is name.
      private static  String vowels(String a) {
            String newStr = a.replaceAll("[^aeiuoAEIOU]", "");
            return newStr;}
// ili samo return word.replaceAll("[^aeiuo]", "");

    public static void main(String[] args) {
        System.out.println(vowels("Anika Komatinovic"));
    }


    }

