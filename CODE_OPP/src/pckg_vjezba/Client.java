package pckg_vjezba;

import java.text.ParseException;

public class Client {
    public static void main(String[] args) throws ParseException {
        DS_Student st1 = new DS_Student("marko");
        System.out.println(st1);
        DS_Student st2 = new DS_Student("tomislav");
        System.out.println(st2);
        DS_Student st3 = new DS_Student("sajd");
        System.out.println(st3);
        st3.setEnrollmentDate();
        st3.infoStudent();


    }
}
