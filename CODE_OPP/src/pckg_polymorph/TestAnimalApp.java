package pckg_polymorph;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestAnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSomeSound();
        Tiger tiger = new Tiger();
        tiger.makeSomeSound();
        RubberTiger rubberTiger = new RubberTiger();
        rubberTiger.makeSomeSound();
        //-----------------------------
        System.out.println("----------------");
        Animal tiger2 = new Tiger();
        tiger2.makeSomeSound();


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Tiger());
        animals.add(new RubberTiger());
        for(Animal any : animals){
            any.makeSomeSound();
        }
    }
}
