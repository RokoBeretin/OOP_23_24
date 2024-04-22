package pckg_vjezba;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Student {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    protected Date enrolmentDate;
    protected String name;
    protected int idStudnet = 100;
    private static int cntStudents = 0;

    Scanner sc = new Scanner(System.in);

    protected Student(String name) {
        this.name = name;
        this.idStudnet = idStudnet + cntStudents;
        this.enrolmentDate = enrolmentDate;
        cntStudents++;

    }

    protected void setEnrollmentDate() throws ParseException, ParseException {
        System.out.println("Please enter enrollment data in the format dd-MM-yyy");
        String date = sc.nextLine();
        this.enrolmentDate = DATE_FORMAT.parse(date);
    }

    public void infoStudent(){
        System.out.println("Student: " + this.name + " - id: " + this.idStudnet);
        System.out.println("Student enrolment date - " + enrolmentDate.toString());

    }
    public abstract void completedStudy(int numStudys);


}
