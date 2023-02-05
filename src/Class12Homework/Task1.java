package Class12Homework;

public class Task1 {
    public static void main(String[] args) {
 //  1) Create a String and if the String is not empty perform the following:
        //if the String has an odd number of characters and has 3 or more characters,
        // print the character in the middle of the String.
        //For Example String str=hello =>l
        String str="Anika.108";

if(!str.isBlank()) {
    if ((str.length() % 2 != 0) && (str.length() > 3)) {
        int middle = str.length() / 2;
        System.out.println(str.charAt(middle));
    }
}
// PRINT ALL THE LETTERS FROM THE STRING ONE BY ONE
int count =0;
        String str1="java is great";
        for(int i=0; i<str1.length(); i++){
            System.out.println(str1.charAt(i));
        }


        //how many times the letter a has appeard in string
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);




    }
}
