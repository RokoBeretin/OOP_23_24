package pckg_polymorph_additional;

public class ClientDevices {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        smartTV.changeProgram();
        Device smartTvDevice = new SmartTV();
        smartTvDevice.turnON();
    }
}
