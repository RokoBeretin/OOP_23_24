package pckg_uml_vj;

import java.text.ParseException;

public class MainTest {
    public static void main(String[] args) {
        try {
            Vehicle veh1 = new Vehicle("BMW", "M4", "23/11/2020");
            veh1.info();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
