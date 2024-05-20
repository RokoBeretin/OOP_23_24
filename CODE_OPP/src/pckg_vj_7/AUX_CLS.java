package pckg_vj_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AUX_CLS {
    public static LinkedList<String> readDataFromFile(String filePath, Scanner scanner){
        LinkedList<String> lista = new LinkedList<>();
        File file = new File(filePath);
        try {
            scanner = new Scanner(file);
            String line;
            while (scanner.hasNextLine()){
                line = scanner.nextLine();
                lista.add(line);
            }
            System.out.println("All data from file are in linked list!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
        }
        return lista;
    }
    public static <E> void printListElements (LinkedList<E> lista){
        for (E element : lista){
            System.out.println(element);
        }
    }
}
