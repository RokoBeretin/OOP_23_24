package pckg_polymorph_additional;

public class Device {
    public Device(){
        System.out.println("Called constcutor for: " + getClass().getSimpleName());
    }
    public void turnON(){
        System.out.println("Simple turn on function for: " + getClass().getSimpleName());
    }
}
