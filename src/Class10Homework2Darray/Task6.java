package Class10Homework2Darray;

public class Task6 {
    public static void main(String[] args) {
        //6)Write a program to swap 2 numbers without a temporary variable?

        int[] numbers ={3,4,5,6,7,9};
        for(int i=0; i< numbers.length; i++){
            System.out.print(numbers[i]+" ");}
        System.out.println();
        System.out.println("******After the swap******");
        numbers[0]=13;
        numbers[3]=17;
for(int i=0; i< numbers.length; i++){
        System.out.print(numbers[i]+" ");}
    }
}
