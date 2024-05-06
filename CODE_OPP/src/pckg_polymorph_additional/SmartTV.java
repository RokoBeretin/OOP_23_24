package pckg_polymorph_additional;

public class SmartTV extends TV{
    public SmartTV(){
        System.out.println("Constructor called for: " + getClass().getSimpleName());
    }

    @Override
    public void turnON() {
        System.out.println("Turing on using smart phone!");
    }

    @Override
    public void changeProgram() {
        System.out.println("Changing program again using smart phone!");
    }
    public void connectToInternet(){
        System.out.println(getClass().getSimpleName() + " can establish connection to Internet!");
    }
}
