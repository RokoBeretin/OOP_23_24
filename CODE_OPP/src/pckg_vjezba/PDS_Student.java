package pckg_vjezba;

import java.text.DateFormat;
import java.util.Date;

public class PDS_Student extends Student{

    protected PDS_Student(String name) {
        super(name);
    }

    @Override
    public void completedStudy(int numStudys) {
        System.out.println(this.name + " has completed: " + numStudys);


    }
}
