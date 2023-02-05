package Class19HW;

public class AclassesTester {
    public static void main(String[] args) {
        Aclass ak=new Aclass();
        ak.color="White";
        ak.type="table";
        ak.printInfo();
        System.out.println(ak.color+" "+ak.type);

        System.out.println("Creating obj from ClassB");

        Bclass ak2=new Bclass();
        ak2.type="bed";
        ak2.weight=15;
        ak2.printType();
        ak2.printInfo();
        System.out.println(ak2.type);


        System.out.println("Creating obj from ClassC");

        Cclass ak3=new Cclass();
        ak3.price=450;
        ak3.color="Grey";
        ak3.model="kids";
        ak3.printBed();
        System.out.println(ak3.model);


    }
}
