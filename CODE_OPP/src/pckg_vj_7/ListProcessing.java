package pckg_vj_7;

import java.util.List;
import java.util.ListIterator;

public class ListProcessing <E> implements ListIterator {
    public static void insertVeh(String vehicle, List<String> lista){
        ListIterator<String> iterator = lista.listIterator();
        while(iterator.hasNext()){
            String currentVehicle = iterator.next();
            System.out.println(currentVehicle);
            if ("electronic bike".equals(currentVehicle)) {
                iterator.add(vehicle);
            }

        }
        System.out.println(lista);

    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public Object previous() {
        return null;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(Object o) {

    }

    @Override
    public void add(Object o) {

    }


}
