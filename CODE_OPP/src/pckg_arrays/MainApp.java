package pckg_arrays;

public class MainApp {

    private static int value;
    private static String name;
    private static String[] names = new String[5];




    public static void main(String[] args) {
        float[] ints = new float[10];
        int[] newInts = {10, 30, -10, 140, 34, 89, 54};
        System.out.println("First array: " + ints.length);
        System.out.println("Second array: " + newInts.length);
        System.out.println("third element - first: " + ints[3]);
        System.out.println("third element - second: " + newInts[3]);

        for(int k = 0; k < ints.length; k++){
            ints[k] = k+1;
        }
        System.out.println("third element - first: " + ints[3]);
        ints[3] = 400.5f;
        System.out.println("third element - first: " + ints[3]);
//        ints[10] = 1000;
        changeElement(names, 2);
        System.out.println(names[2]);

    }

    private static void changeElement(String[] names, int indx){
        String newName = "Neko novo ime";
        if(indx < names.length-1){
            names[indx] = newName;
            System.out.println("Name was changed");
        }else {
            System.out.println("Out of bounds");
        }
    }

}
