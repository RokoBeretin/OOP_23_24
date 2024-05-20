package pckg_vj_7;

import java.util.Comparator;

public class ReverseIntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer integer, Integer t1) {
        return -integer.compareTo(t1);
    }
}
