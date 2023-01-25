package Class12Homework;

public class Task1 {
    public static void main(String[] args) {
 //  1) Create a String and if the String is not empty perform the following:
        //if the String has an odd number of characters and has 3 or more characters,
        // print the character in the middle of the String.
        //For Example String str=hello =>l
        String str="Anika.108";
        System.out.println(str.isEmpty());

        if((str.length()%2!=0) && (str.length()>3)){
            System.out.println(str.charAt(5));
        }



    }
}
