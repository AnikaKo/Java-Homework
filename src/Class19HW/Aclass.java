package Class19HW;

public class Aclass {
    //  HW: Write program for multilevel inheritance where class C
    //  inherits from class B and Class B inherits from Class A.

    String type;
    String color;

    void printInfo() {
        System.out.println("Very comfortable.");
    }
}
   class Bclass extends Aclass {

       int weight;

       void printType() {
           System.out.println("living room furniture");

       }
   }
  class Cclass extends Bclass {
      String model;
      int price;

      void printBed() {
          System.out.println("Queen bed ");
      }
  }
