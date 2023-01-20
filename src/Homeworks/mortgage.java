package Homeworks;

public class mortgage {
    public static void main(String[] args) {
        /*Create a Java program and store values of Homeworks.mortgage rate and Homeworks.mortgage price. First,
        program should check if rate is higher than 4.5 user will not buy a house, otherwise
        user will consider buying. Once user decides to buy a house, if price of the house is
        larger than 200000 than user will take a Homeworks.loan, otherwise user will pay cash.*/
        int rate =3;
        int price= 250000;

        if(rate<4.5){if(price>200000){
            System.out.println("Take a Homeworks.loan");}
            else{
            System.out.println("pay cash");}}
        else{
            System.out.println("Will consider buying a house");}









    }
}
