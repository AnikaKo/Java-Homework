package Class10Homework2Darray;

public class Task3 {
    public static void main(String[] args) {
        //3) Create a 2D array of integer values. Print the sum of all numbers.
        int[] [] numbers={{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12}};
for(int i=0; i<numbers.length; i++){
    for(int j=0; j<numbers[i].length; j++){
        System.out.print(numbers[i][j]+" ");}
    System.out.println();
}
int sum=0;

        System.out.println("*****************");
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
         sum=sum+numbers[i][j];
            System.out.println(numbers[i][j]);}
         System.out.println(sum);}

    }
}
