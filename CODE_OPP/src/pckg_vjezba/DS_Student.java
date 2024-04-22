package pckg_vjezba;

import java.text.DateFormat;

public class DS_Student extends Student{

    protected DS_Student(DateFormat dateFormat, String name, int idStudnet, int cntStudents) {
        super(dateFormat, name, idStudnet, cntStudents);
    }

    @Override
    public void completedStudy(int numStudys) {

    }
}
