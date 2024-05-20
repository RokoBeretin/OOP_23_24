package pckg_vj_7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class TextApp {
    private static Scanner scanner;
    public static void main(String[] args) {
        LinkedList<String> list = AUX_CLS.readDataFromFile("C:\\Users\\aerro\\IdeaProjects\\OOP_23_24\\CODE_OPP\\src\\pckg_vj_7\\fajl.txt", scanner);
        AUX_CLS.printListElements(list);
        Collections.sort(list, new StringLenghtComparator());
        System.out.println(list);
    }
}
