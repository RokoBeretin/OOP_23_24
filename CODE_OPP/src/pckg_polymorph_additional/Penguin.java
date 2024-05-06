package pckg_polymorph_additional;

public class Penguin implements Animal{
    @Override
    public void makeSomeSound() {
        System.out.println(getClass().getSimpleName() + " making a penguin characteristic sound!");

    }

    @Override
    public void runFast() {
        System.out.println(getClass().getSimpleName() + " is running fast!");

    }

    @Override
    public void drinkWater() {
        System.out.println(getClass().getSimpleName() + " is drinking water!");

    }

    @Override
    public void goToSleep() {
        System.out.println(getClass().getSimpleName() + " is going to sleep!");

    }

    public void catchAFish(){
        System.out.println(getClass().getSimpleName() + " can catch a fish!");
    }
}
