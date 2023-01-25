package Class12Homework;

public class Task2interview {
    public static void main(String[] args) {
  //    2) Create a String and print it in reverse order (Sunday → yadnuS). INTERVJU PITANJE
        String str="Table";
        String newStr="";

        for(int i=0; i<str.length(); i++){
            char character=str.charAt(i);
            newStr=character+newStr;}
        System.out.println(newStr);
    }
}
