package pckg_uml;

import java.util.ArrayList;

public class Professor extends Person{

    private ArrayList<Student> students;


    public Professor(String name, String surname) {



        super(name, surname);
        students = new ArrayList<>();
        System.out.println(this.getClass().getSimpleName() + "constructor called!");

    }
    //public void setStudent(Student student){
    //    this.student = student;
    //}

    public void performConsultation(){
        System.out.println(this.getClass().getSimpleName() + " gives consulative lecture to students...");
        for(Student student : students){
            student.askQuestion();

        }
    }
}
