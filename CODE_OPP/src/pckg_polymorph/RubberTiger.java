package pckg_polymorph;

public class RubberTiger extends Animal{
    @Override
    public void makeSomeSound() {
        System.out.println(getClass().getSimpleName() + " making some artificial sound of a tiger...");
    }
}
