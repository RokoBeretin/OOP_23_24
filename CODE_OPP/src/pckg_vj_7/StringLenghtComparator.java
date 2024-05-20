package pckg_vj_7;

import java.util.Comparator;

public class StringLenghtComparator implements Comparator<String> {



    @Override
    public int compare(String s, String t1) {
        Integer l1 = s.length();
        Integer l2 = t1.length();
        return l2.compareTo(l2);
    }


}
