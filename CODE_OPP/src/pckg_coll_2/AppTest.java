package pckg_coll_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AppTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("automobil");
        list.add("karic");
        list.add("romobil");
        list.add("bicikla");
        list.add("avion");
        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
        LenghtStringComparator lenghtStringComparator = new LenghtStringComparator();
        Collections.sort(list, lenghtStringComparator);
        System.out.println(list);
    }
}
