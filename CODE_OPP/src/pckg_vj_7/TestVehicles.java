package pckg_vj_7;

import java.util.*;

public class TestVehicles {
    private static String[] vehicles = {"car",
            "helicopeter",
            "electronic bike",
            "truck",
            "motorcycle",
            "carriage"};
    public static void main(String[] args) {
        List<String> vehs = new ArrayList<>();
        Collections.addAll(vehs, vehicles);
        ListProcessing.insertVeh("aa", vehs);

    }
    private static void printList(LinkedList<String> list){
        for(String el : list){
            System.out.println(el);
        }
    }
    private static void printList(Iterator<String> listIterator){
        System.out.println("----------------------------------------------------------------------------------");
        while (listIterator.hasNext()){
            String next = listIterator.next();
            if (next.equals("carriage")){
                listIterator.remove();
                System.out.println("Removed from list");
            }
            System.out.println(next);
        }
    }

}
