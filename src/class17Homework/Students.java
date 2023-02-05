package class17Homework;

public class Students {

 /*  2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
 Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students
  with different marks. Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.*/
        String name;
        int mathGrade;
        int scienceGrade;
        int historyGrade;

        Students (String sName, int sMathGrade, int sScienceGrade, int sHistoryGrade){
            name=sName;
            mathGrade=sMathGrade;
            scienceGrade=sScienceGrade;
            historyGrade=sHistoryGrade;}
    char average(){
        int avg=(mathGrade+scienceGrade+historyGrade)/3;
        if(avg>=90){
            return 'A';
        } else if (avg>=80) {
            return 'B';
        } else if (avg>=70) {
            return 'C';
        }else if(avg>=60){
            return 'D';
        }else {
            return 'F';
        }
    }

    void printInfo(){
        System.out.println("Students name: "+name+" average grade "+average());}

    public static void main(String[] args) {
        Students st1=new Students("Anika",98,87,60);
        st1.printInfo();

        Students st2=new Students("Mimi",89,78,96);
        st2.printInfo();

        Students st3=new Students("Milica",99,88,78);
        st3.printInfo();

        Students st4=new Students("Marija",78,76,89);
        st4.printInfo();

        Students st5=new Students("Andrea",89,87,98);
        st5.printInfo();
    }
    }

