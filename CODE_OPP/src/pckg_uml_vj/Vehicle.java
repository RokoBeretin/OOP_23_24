package pckg_uml_vj;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
    protected String model;
    protected String brand;
    protected Date dateProduced;

    private int id;
    private static int cnt = 20;
    private static final String datePattern = "dd/MM/yyyy";

    public Vehicle(){
        this.id = cnt++;

    }
    public Vehicle(String brand){
        this.brand = brand;
        this.id = cnt++;
    }
    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.id = cnt++;
    }
    public Vehicle(String brand, String model, String date) throws ParseException {
        this(brand, model);
        setDate(date);
    }
    private void setDate(String dateAsText) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        this.dateProduced = simpleDateFormat.parse(dateAsText);

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", dateProduced=" + dateProduced +
                ", id=" + id +
                '}';
    }
    public void info(){
        System.out.println(this);
    }
    public void start(){
        System.out.println(getClass().getSimpleName() + " starting engine...");
    }
    public void stop(){
        System.out.println(getClass().getSimpleName() + " engine stopped...");
    }
}
