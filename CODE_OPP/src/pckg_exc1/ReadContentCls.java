package pckg_exc1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadContentCls {
    public static void readFromFile(String filePath) throws FileNotFoundException{
        File file = new File(filePath);
//        try {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
        String line = scanner.nextLine();
        System.out.println("line: " + line);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found - check path or file existence...");
        }

    }
}
