package class9Array;

public class Task5 {
    public static void main(String[] args) {
        /*5) Create an array of size 5 on integers and calculate the sum of all elements in an array.*/
        int[] numbers={34,56,32,78,89};
        int sum=0;
        for(int i=0; i< numbers.length; i++){
            sum=sum+numbers[i];}
        System.out.println(sum);
    }
}
