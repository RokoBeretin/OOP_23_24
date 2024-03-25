package pckg_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArr {
    public static void main(String[] args) {
//        int[] arr = AUX_CLS.populateArrayRand(5);
//        System.out.println(Arrays.toString(arr));
//        AUX_CLS.listIntArray(arr);

//        int[] arr1 = AUX_CLS.userPopulatedArray(3);
//        System.out.println(Arrays.toString(arr1));
        String[] strArr = {"Vasa", "vana plurimum", "sonant"};
        String linked = AUX_CLS.linkStringUsingJoin(strArr);
        System.out.println(linked);
        String svLinked = AUX_CLS.linkStringUsingBuilder(strArr);
        System.out.println(svLinked);
        String concate = AUX_CLS.concatenateArrayElements(strArr);
        System.out.println(concate);
        int[][] arr2d = AUX_CLS.gen2DIntArray(3,4);
        AUX_CLS.list2DArray(arr2d);

    }
}
