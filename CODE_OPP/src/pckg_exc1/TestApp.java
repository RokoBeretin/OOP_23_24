package pckg_exc1;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<>();
        robots.add(new FlyingRobot("Fly-01"));
        robots.add(new IndustrialRobot("IND-01"));
        robots.add(new FlyingRobot("Fly-02"));
        robots.add(new StarWarsRobot("R2-D2"));
        System.out.println(robots);
    }
}
