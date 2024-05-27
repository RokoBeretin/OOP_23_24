package pckg_serial_deserial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AUX_CLS_SER_DESR {
    public static <T> void saveObjToFile(String filePath, T someObject){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))){
            oos.writeObject(someObject);
            System.out.println("Object written to a file");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <E> void saveMultipleObjToFile(String filePath, List<E> objects){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))){
            for (E element : objects){
                oos.writeObject(element);
                System.out.println("Object written to a file...");
            }
            System.out.println("All objects are written to a file!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static <T> void readObjectFromFile(String filePath){
        T someObject = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filePath)))){
            someObject = (T) ois.readObject();
            System.out.println("Object recovered from a file:");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static <E> List<E> readObjectsFromFile(String filePath){
        List<E> elements = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filePath)))){
            while (ois.available() > 0){
                E someElement = (E) ois.readObject();
                elements.add(someElement);
                System.out.println("One element from file is added to a list");
            }
            System.out.println("All elements in list");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return elements;
    }

}

