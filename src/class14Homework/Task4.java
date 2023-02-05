package class14Homework;

public class Task4 {
//        4)Create a method that will say Hello in different language based on the country that will
//        passed when method is executed
    String hello(String country){
        switch (country){
            case "USA":
                return "hello";
            case "Serbia":
                return "zdravo";
            case "Kazahstan":
                return "salem";
            case "China":
                return "Ni hao";
            default:
                return "country not supported";

        }
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println(task4.hello("Serbia"));
    }
}
