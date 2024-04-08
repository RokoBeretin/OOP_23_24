package pckg_uml;

public class MainApp {
    public static void main(String[] args) {
        Person person = new Person("Isus", "Krist");
        Student stu = new Student("Juda", "Izdajnik");
        Professor prof = new Professor("Bog", "Svemoguci");
        //prof.setStudent(stu);
        prof.performConsultation();

    }
}
