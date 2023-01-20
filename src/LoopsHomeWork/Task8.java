package LoopsHomeWork;

public class Task8 {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (2 ways)
      /* int a=20;
        while(a<50){if(a%2!=0){
            System.out.println(a);}
            a++;}*/
        int a=20;
        do{if(a%2!=0){
            System.out.println(a);}
            a++;}
        while(a<50);

    }
}
