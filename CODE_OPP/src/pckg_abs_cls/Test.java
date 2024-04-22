package pckg_abs_cls;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ime", "Prezime", "UNI ZD", "IT");
        st1.getSignature();
        st1.getInfo();
        Superhero sh1 = new Superhero("Jak", "Bro", "Jakomen");
        sh1.flyAroundTown();
        sh1.getSignature();
        sh1.haveEnormousStrenght(6);
    }
}
