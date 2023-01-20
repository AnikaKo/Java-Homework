package class9Array;

public class Task2 {
    public static void main(String[] args) {
        //2) Create an array of names and store all names of your group.
        // Then print your name from that array. (use 2 different ways of creating an array).
        String[] names= {"Ana", "Mimi", "Savce", "Cecana", "Ljix", "Icke"};
        System.out.println(names[0]);
        System.out.println("*****************");
        String[] names2= new String[6];
        names2 [0] = "Ana";
        names2 [1] = "Mimi";
        names2 [2] =  "Savce";
        names2 [3] = "Cecana";
        names2 [4] = "ljix";
        names2 [5] = "Icke";

        System.out.println(names2[0]);

    }
}
