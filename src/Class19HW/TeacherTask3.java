package Class19HW;

public class TeacherTask3 {
    /*Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own
    features and behaviour. Test all 4 classes */
String name;
String LastName;
int age;
void info(){
    System.out.println("Hello");
}
void infoL(){
    System.out.println("Welcome on todays class");
}
void life(){
    System.out.println("What is your fav class");
}
void hobby(){
    System.out.println("We will learn together");
}
}
class Mathclass extends TeacherTask3{
    String subject;

    void classInfo(){
        System.out.println("Beautifull school");
    }
}
class ChemistryTeacher extends TeacherTask3{
    String lesson;
    void todayInfo(){
        System.out.println("what is todays lesson about ");
    }
}
class PianoTeacher extends TeacherTask3{
    String instrument;

    void playingInfo(){
        System.out.println("Lets study");
    }
}