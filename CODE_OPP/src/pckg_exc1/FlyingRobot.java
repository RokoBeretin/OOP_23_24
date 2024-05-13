package pckg_exc1;

public class FlyingRobot extends Robot{
    protected FlyingRobot(String name) {
        super(name);
    }

    @Override
    public void charge() {
        System.out.println("Charging robot: " + getClass().getSimpleName());
    }

    @Override
    public void changeState() {
        System.out.println("Changing state bz flying into desired direction..");

    }

    @Override
    public String toString() {
        return "FlyingRobot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
