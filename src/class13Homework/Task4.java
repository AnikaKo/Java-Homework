package class13Homework;

public class Task4 {
    public static void main(String[] args) {
        //   4) How would you reverse a String word by word? for example
        //        // input=>This is sentence i want to reverse
        //        // output=>sihT si ecnetnes i tnaw ot esrever

        String str = "This is sentence i want to reverse";
        String[] arr = str.split(" ");

        for (String word : arr) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }


        }

    }

}