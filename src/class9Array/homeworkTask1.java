package class9Array;

public class homeworkTask1 {
    public static void main(String[] args) {
        //Create an array of chars and store grades into it: A,B,C,D,E,F.
        // Then print a grade B (use 2 different ways of creating an array).

        char[] array = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println(array[1]);
        System.out.println("**********************");
        //secound way
        char[] array2 = new char[6];
        array2 [0]= 'A';
        array2 [1]= 'B';
        array2 [2]= 'C';
        array2 [3]= 'D';
        array2 [4]= 'E';
        array2 [5]= 'F';

        System.out.println(array2[1]);

    }
}
