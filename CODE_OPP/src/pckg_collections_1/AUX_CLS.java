package pckg_collections_1;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class AUX_CLS {
    public static <E> void addElementToList(List<E> lista, E element){
        lista.add(element);

    }

    public static <K, V> void addValueInMap(HashMap<K, V> elements, V value, K key){
        elements.put(key, value);
    }

    public static <E> void listAllElementsInList(List<E> list){
        for(E el : list){
            System.out.println(el);
        }

    }
    public static <K, V> void listAllFromMap(HashMap<K, V> map){
        for(K k : map.keySet()){
            System.out.println("Key: " + k + " Value: " + map.get(k));

        }
    }
    public static <E> void addElementToTreeSet(TreeSet<E> set, E element){
        set.add(element);
    }
    public static <E> void listElementsFromTreeSet(TreeSet<E> set){
        for(E element : set){
            System.out.println(element);
        }
    }

}
