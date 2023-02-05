package class14Homework;

public class Tas1 {

 // 1 ) Create a method that will take 2 parameters as a numbers and prints which number is larger.
int numbers (int a, int b){
    if(a>b){
        return a;
    }else{
        return b;
    }
        }

        public static void main(String []args){

    Tas1 ak=new Tas1();

            System.out.println(ak.numbers(3,5));
    }
}
