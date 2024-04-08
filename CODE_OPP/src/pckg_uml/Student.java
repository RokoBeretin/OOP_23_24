package pckg_uml;

public class Student extends User{
    public Student(String userName, String mail, String password) {
        super(userName, mail, password);
    }
    public int getExam(String course){

        return 2;
    }
}
