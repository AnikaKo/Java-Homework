package Class19HW;

import java.util.concurrent.Callable;

public class TeacherTester {
    public static void main(String[] args) {
        TeacherTask3 teacherTask3=new TeacherTask3();
        teacherTask3.name= "Anika";
        teacherTask3.info();


ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
chemistryTeacher.LastName="Jovanovic";
chemistryTeacher.todayInfo();
chemistryTeacher.info();

PianoTeacher pianoTeacher=new PianoTeacher();
pianoTeacher.playingInfo();
pianoTeacher.life();
pianoTeacher.instrument="guitar";
pianoTeacher.age=45;
    }
}
